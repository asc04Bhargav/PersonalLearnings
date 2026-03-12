import { Link, useNavigate } from 'react-router-dom'
import { deleteJob } from '../services/api'

function JobList({ jobs, reloadJobs }) {
  const navigate = useNavigate()

  const handleDelete = async (id) => {
    if (confirm('Are you sure you want to delete this job?')) {
      await deleteJob(id)
      alert('Job deleted successfully')
      reloadJobs()
    }
  }

  if (jobs.length === 0) {
    return <p className="text-muted">No jobs found.</p>
  }

  return (
    <div className="container mt-4">
      <h2 className="mb-4">Available Jobs</h2>
      {jobs.map(job => (
        <div key={job.id} className="card mb-3 shadow-sm">
          <div className="card-body">
            <h4 className="card-title">{job.title} <small className="text-muted">@ {job.companyName}</small></h4>
            <p className="card-text"><strong>Location:</strong> {job.location}</p>
            <p className="card-text"><strong>Salary:</strong> {job.salary}</p>
            <p className="card-text">{job.description.substring(0, 100)}...</p>

            <Link to={`/apply/${job.id}`} className="btn btn-primary btn-sm me-2">Apply</Link>
            <button className="btn btn-warning btn-sm me-2" onClick={() => navigate(`/edit-job/${job.id}`)}>Edit</button>
            <button className="btn btn-danger btn-sm" onClick={() => handleDelete(job.id)}>Delete</button>
          </div>
        </div>
      ))}
    </div>
  )
}

export default JobList
