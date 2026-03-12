package com.telusko.spring_boot_rest.service;


import com.telusko.spring_boot_rest.model.User;
import com.telusko.spring_boot_rest.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;
    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(12);

    public User saveUser(User user){

        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        System.out.println(user.getPassword());

        return repo.save(user);
    }
}
