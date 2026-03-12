const BASE_URL = 'http://localhost:8086'; // ✅ Updated backend port

// Job APIs
export const fetchJobs = async () => {
  const res = await fetch(`${BASE_URL}/jobs`);
  return res.json();
};

export const fetchJobById = async (id) => {
  const res = await fetch(`${BASE_URL}/jobs/${id}`);
  return res.json();
};

// export const createJob = async (job) => {
//   const res = await fetch(`${BASE_URL}/jobs`, {
//     method: 'POST',
//     headers: { 'Content-Type': 'application/json' },
//     body: JSON.stringify(job)
//   });
//   return res.json();
// };


export const createJob = async (job) => {
  const res = await fetch(`${BASE_URL}/jobs`, {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(job)
  });

  if (!res.ok) {  // ✅ Prevent crash on 500 error
    const errorText = await res.text();
    throw new Error(`Server error: ${errorText}`);
  }

  return res.json();
};



export const updateJob = async (id, job) => {
  const res = await fetch(`${BASE_URL}/jobs/${id}`, {
    method: 'PUT',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(job)
  });
  return res.json();
};

export const deleteJob = async (id) => {
  return fetch(`${BASE_URL}/jobs/${id}`, { method: 'DELETE' });
};

// Application APIs
export const applyForJob = async (application) => {
  const res = await fetch(`${BASE_URL}/applications`, {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(application)
  });
  return res.json();
};
