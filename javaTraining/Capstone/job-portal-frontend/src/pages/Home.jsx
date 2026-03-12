import { useState, useEffect } from 'react'
import { useNavigate } from 'react-router-dom'
import JobList from '../components/JobList'
import { fetchJobs } from '../services/api'

function Home() {
  const [jobs, setJobs] = useState([])
  const [searchTerm, setSearchTerm] = useState('')
  const navigate = useNavigate()

  useEffect(() => {
    loadJobs()
  }, [])

  const loadJobs = async () => {
    const data = await fetchJobs()
    setJobs(data)
  }

  const handleSearch = (e) => {
    e.preventDefault()
    const filtered = jobs.filter(job =>
      job.title.toLowerCase().includes(searchTerm.toLowerCase())
    )
    setJobs(filtered)
  }

  return (
    <div className="container mt-4">
      <h1 className="mb-3">Job Board Lite</h1>
      <p className="lead">Find and apply for your dream job!</p>

      <form onSubmit={handleSearch} className="row g-2 mb-4">
        <div className="col-md-6">
          <input
            type="text"
            className="form-control"
            placeholder="Search by role"
            value={searchTerm}
            onChange={(e) => setSearchTerm(e.target.value)}
          />
        </div>
        <div className="col-auto">
          <button type="submit" className="btn btn-primary">Search</button>
        </div>
        <div className="col-auto">
          <button type="button" onClick={loadJobs} className="btn btn-secondary">Reset</button>
        </div>
        <div className="col-auto">
          <button
            type="button"
            className="btn btn-success"
            onClick={() => navigate('/add-job')}
          >
            Post New Job
          </button>
        </div>
      </form>

      <JobList jobs={jobs} reloadJobs={loadJobs} />
    </div>
  )
}

export default Home
