import { useParams, useNavigate } from 'react-router-dom'
import { useState, useEffect } from 'react'
import { fetchJobById, createJob, updateJob } from '../services/api'

function JobForm() {
  const { jobId } = useParams()
  const navigate = useNavigate()

  const [form, setForm] = useState({
    title: '',
    description: '',
    location: '',
    companyName: '',
    salary: '',
    skills: ''
  })

  const isEditing = Boolean(jobId)

  useEffect(() => {
    if (isEditing) {
      const loadJob = async () => {
        const data = await fetchJobById(jobId)
        setForm({
          title: data.title,
          description: data.description,
          location: data.location,
          companyName: data.companyName,
          salary: data.salary,
          skills: Array.isArray(data.skills) ? data.skills.join(', ') : data.skills // 👈 Join array to comma string if needed
        })
      }
      loadJob()
    }
  }, [jobId])

  const handleChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value })
  }

  const handleSubmit = async (e) => {
    e.preventDefault()
    const processedForm = {
      ...form,
      skills: form.skills.split(',').map(skill => skill.trim()) // 👈 Always send skills as array
    }
    if (isEditing) {
      await updateJob(jobId, processedForm) // 👈 use processedForm
      alert('Job updated successfully!')
    } else {
      await createJob(processedForm) // 👈 use processedForm
      alert('Job created successfully!')
    }
    navigate('/')
  }

  return (
    <div className="container mt-4">
      <h2 className="mb-4">{isEditing ? 'Edit Job' : 'Add New Job'}</h2>

      <form onSubmit={handleSubmit} className="row g-3">
        <div className="col-md-6">
          <input
            type="text"
            name="title"
            className="form-control"
            placeholder="Job Title"
            value={form.title}
            onChange={handleChange}
            required
          />
        </div>

        <div className="col-md-6">
          <input
            type="text"
            name="companyName"
            className="form-control"
            placeholder="Company Name"
            value={form.companyName}
            onChange={handleChange}
            required
          />
        </div>

        <div className="col-md-6">
          <input
            type="text"
            name="location"
            className="form-control"
            placeholder="Location"
            value={form.location}
            onChange={handleChange}
            required
          />
        </div>

        <div className="col-md-6">
          <input
            type="number"
            name="salary"
            className="form-control"
            placeholder="Salary"
            value={form.salary}
            onChange={handleChange}
            required
          />
        </div>

        <div className="col-12">
          <textarea
            name="description"
            className="form-control"
            placeholder="Job Description"
            value={form.description}
            onChange={handleChange}
            required
            rows="3"
          ></textarea>
        </div>

        <div className="col-12">
          <textarea
            name="skills"
            className="form-control"
            placeholder="Required Skills (comma-separated)"
            value={form.skills}
            onChange={handleChange}
            required
            rows="2"
          ></textarea>
        </div>

        <div className="col-12">
          <button type="submit" className="btn btn-success">
            {isEditing ? 'Update Job' : 'Create Job'}
          </button>
        </div>
      </form>
    </div>
  )
}

export default JobForm
