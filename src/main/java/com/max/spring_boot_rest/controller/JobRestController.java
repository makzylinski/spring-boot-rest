package com.max.spring_boot_rest.controller;

import com.max.spring_boot_rest.model.JobPost;
import com.max.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class JobRestController {

    @Autowired
    private JobService jobService;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId) {
        return jobService.getJob(postId);
    }

    @PostMapping
    public void addJob(@RequestBody JobPost jobPost) {
        jobService.addJob(jobPost);
    }

}
