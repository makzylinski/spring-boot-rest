package com.max.spring_boot_rest.service;

import com.max.spring_boot_rest.model.JobPost;
import com.max.spring_boot_rest.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public void addJob(JobPost jobPost) {
        jobRepository.addJob(jobPost);
    }

    public List<JobPost> getAllJobs() {
        return jobRepository.getAllJobs();
    }

    public JobPost getJob(int postId) {
        return jobRepository.getJob(postId);
    }

    public void updateJob(JobPost jobPost) {
        jobRepository.updateJob(jobPost);
    }

    public void deleteJob(int postId) {
        jobRepository.deleteJob(postId);
    }
}
