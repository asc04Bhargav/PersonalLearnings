package com.boot.jobboard.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.jobboard.rest.dvo.Job;
import com.boot.jobboard.rest.exception.JobNotFoundException;
import com.boot.jobboard.rest.repo.JobRepository;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public List<Job> getAllJobs() {

        return jobRepository.findAll();
    }

//    public List<Job> searchJobs(String role) {
//        return jobRepository.findByTitleContainingIgnoreCase(role);
//    }
    
    public List<Job> searchJobs(String roleKeyword) {
        List<Job> jobs = jobRepository.findByTitleContainingIgnoreCase(roleKeyword);

        if (jobs.isEmpty()) {
            throw new JobNotFoundException("No jobs found for role: " + roleKeyword);
        }

        return jobs;
    }


    public Optional<Job> getJobById(Long id) {

        return jobRepository.findById(id);
    }

    public Job saveJob(Job job) {
        return jobRepository.save(job);
    }

    public Job updateJob(Long id, Job updatedJob) {
        Job existingJob = jobRepository.findById(id)
                .orElseThrow(() -> new JobNotFoundException("Job not found with id: " + id));

        existingJob.setTitle(updatedJob.getTitle());
        existingJob.setCompanyName(updatedJob.getCompanyName());
        existingJob.setLocation(updatedJob.getLocation());
        existingJob.setDescription(updatedJob.getDescription());
        existingJob.setSalary(updatedJob.getSalary());

        // Add other fields as needed

        return jobRepository.save(existingJob);
    }

    public void deleteJob(Long id) {
        if (!jobRepository.existsById(id)) {
            throw new JobNotFoundException("Job not found with id: " + id);
        }
        jobRepository.deleteById(id);
    }


}

