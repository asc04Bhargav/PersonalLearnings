package com.telusko.spring_boot_rest.controller;

import com.telusko.spring_boot_rest.model.JobPost;
import com.telusko.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins= "http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping(path = "jobposts")
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("jobpost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId){
        return service.getJob(postId);
    }

    @PostMapping(path = "jobpost")
    public JobPost addJob(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @PutMapping("jobpost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @DeleteMapping("jobpost/{postId}")
    public String deleteJob(@PathVariable("postId") int postId){
        service.deleteJob(postId);
        return "Deleted";
    }

    @GetMapping("jobposts/keyword/{keyword}")
    public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword) {
        return service.search(keyword);
    }

    @GetMapping("load")
    public String loadData(){
        service.load();

        return "success";
    }
}
