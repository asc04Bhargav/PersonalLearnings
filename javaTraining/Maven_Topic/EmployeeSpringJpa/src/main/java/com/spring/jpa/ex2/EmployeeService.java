package com.spring.jpa.ex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public void addOrUpdateProduct(Employee e){
        repo.save(e);
        System.out.println("Record added or Updated..");

    }
}
