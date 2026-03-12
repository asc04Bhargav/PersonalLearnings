package com.boot.jobboard.rest.repo;

import com.boot.jobboard.rest.dvo.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
