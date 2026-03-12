package com.telusko.app.service;

import com.telusko.app.repository.LaptopRepository;
import com.telusko.app.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repo;


    public void addLaptop(Laptop lap){
        repo.save(lap);
    }

    public boolean isGoodForProgramming(Laptop lap){
        return true;
    }
}
