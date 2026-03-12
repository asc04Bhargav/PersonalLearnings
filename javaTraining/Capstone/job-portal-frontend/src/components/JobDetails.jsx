import { useParams, useNavigate } from 'react-router-dom'
import { useEffect, useState } from 'react'
import { fetchJobById } from '../services/api'

function JobDetails() {
  const { jobId } = useParams()
  const navigate = useNavigate()
  const [job, setJob] = useState(null)

  useEffect(() => {
    const loadJob = async () => {
      const data = await fetchJobById(jobId)
      setJob(data)
    }
    loadJob()
  }, [jobId])

  if (!job) return <p>Loading job details...</p>

  return (
    <div>
      <h2>{job.title}</h2>
      <p><strong>Company:</strong> {job.companyName}</p>
      <p><strong>Location:</strong> {job.location}</p>
      <p><strong>Salary:</strong> {job.salary}</p>
      <p><strong>Skills Required:</strong> {job.skills}</p>
      <p><strong>Description:</strong> {job.description}</p>

      <button onClick={() => navigate(`/apply/${job.id}`)}>Apply for this Job</button>
      <button onClick={() => navigate('/')}>Back to Job List</button>
    </div>
  )
}

export default JobDetails
