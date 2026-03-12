package com.boot.jobboard.rest.repo;

import com.boot.jobboard.rest.dvo.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobRepository extends JpaRepository<Job, Long> {
    List<Job> findByTitleContainingIgnoreCase(String title);
}
