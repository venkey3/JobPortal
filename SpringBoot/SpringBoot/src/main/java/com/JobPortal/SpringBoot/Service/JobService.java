package com.JobPortal.SpringBoot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.JobPortal.SpringBoot.Model.JobPost;
import com.JobPortal.SpringBoot.repo.JobRepo;

@Service
public class JobService {

@Autowired    
private JobRepo repo;

    // add data
public void addjob(JobPost jobPost){

    repo.addJob(jobPost);

}
// view data
public List<JobPost> getallJobs(){
return repo.getallJobs();
}

public void updateJob(JobPost jobpost) {
    repo.updateJob(jobpost);
}
public void deleteJob(int postId) {
    repo.deleteJob(postId);
}

    

}
