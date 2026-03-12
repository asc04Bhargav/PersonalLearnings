package com.boot.jobboard.rest.service;

import com.boot.jobboard.rest.dvo.Application;
import com.boot.jobboard.rest.repo.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;


    public Application saveApplication(Application application) {
        return applicationRepository.save(application);
    }

    public Application updateApplication(Long id, Application updatedApp) {
        Application existingApp = applicationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Application not found with id: " + id));

        existingApp.setFullName(updatedApp.getFullName());
        existingApp.setEmail(updatedApp.getEmail());
        existingApp.setPhone(updatedApp.getPhone());
        existingApp.setSkills(updatedApp.getSkills());
        existingApp.setJobId(updatedApp.getJobId());

        return applicationRepository.save(existingApp);
    }

    public void deleteApplication(Long id) {
        if (!applicationRepository.existsById(id)) {
            throw new RuntimeException("Application not found with id: " + id);
        }
        applicationRepository.deleteById(id);
    }

    public Application getApplicationById(Long id) {
        return applicationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Application not found with id: " + id));
    }

    public List<Application> getAllApplications() {
        return applicationRepository.findAll();
    }
}
