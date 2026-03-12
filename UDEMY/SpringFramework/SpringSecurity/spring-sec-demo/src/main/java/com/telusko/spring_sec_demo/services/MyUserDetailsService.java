package com.telusko.spring_sec_demo.services;

import com.telusko.spring_sec_demo.dao.UserRepo;
import com.telusko.spring_sec_demo.model.User;
import com.telusko.spring_sec_demo.model.UserPrinciple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {


    private UserRepo repo;

    public MyUserDetailsService(UserRepo repo) {
        this.repo = repo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = repo.findByUsername(username);
        if (user == null){
            System.out.println("User 404");
            throw new UsernameNotFoundException("user 404");
        }

        return new UserPrinciple(user);
    }
}
