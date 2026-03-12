import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'
import Home from './pages/Home'
import ApplicationForm from './components/ApplicationForm'
import JobForm from './components/JobForm'
import JobDetails from './components/JobDetails'

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/apply/:jobId" element={<ApplicationForm />} />
        <Route path="/add-job" element={<JobForm />} />
        <Route path="/edit-job/:jobId" element={<JobForm />} />
        <Route path="/job/:jobId" element={<JobDetails />} />
      </Routes>
    </Router>
  )
}

export default App
