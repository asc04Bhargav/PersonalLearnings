import { useParams, useNavigate } from 'react-router-dom'
import { useState, useEffect } from 'react'
import { fetchJobById, applyForJob } from '../services/api'

function ApplicationForm() {
  const { jobId } = useParams()
  const navigate = useNavigate()

  const [job, setJob] = useState(null)
  const [form, setForm] = useState({
    jobId: jobId,
    fullName: '',
    email: '',
    phone: '',
    skills: ''
  })

  useEffect(() => {
    const loadJob = async () => {
      const data = await fetchJobById(jobId)
      setJob(data)
    }
    loadJob()
  }, [jobId])

  const handleChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value })
  }

  const handleSubmit = async (e) => {
    e.preventDefault()
    await applyForJob(form)
    alert('Application submitted successfully!')
    navigate('/')
  }

  if (!job) return <p className="text-muted">Loading job details...</p>

  return (
    <div className="container mt-4">
      <h2 className="mb-4">Apply for: {job.title} <small className="text-muted">@ {job.companyName}</small></h2>

      <form onSubmit={handleSubmit} className="row g-3">
        <div className="col-md-6">
          <input
            type="text"
            name="fullName"
            className="form-control"
            placeholder="Full Name"
            value={form.fullName}
            onChange={handleChange}
            required
          />
        </div>

        <div className="col-md-6">
          <input
            type="email"
            name="email"
            className="form-control"
            placeholder="Email"
            value={form.email}
            onChange={handleChange}
            required
          />
        </div>

        <div className="col-md-6">
          <input
            type="tel"
            name="phone"
            className="form-control"
            placeholder="Phone"
            value={form.phone}
            onChange={handleChange}
            required
          />
        </div>

        <div className="col-12">
          <textarea
            name="skills"
            className="form-control"
            placeholder="Your Skills (comma-separated)"
            value={form.skills}
            onChange={handleChange}
            required
            rows="3"
          ></textarea>
        </div>

        <div className="col-12">
          <button type="submit" className="btn btn-primary">Submit Application</button>
        </div>
      </form>
    </div>
  )
}

export default ApplicationForm
