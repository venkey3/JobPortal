package com.JobPortal.SpringBoot.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.JobPortal.SpringBoot.Model.JobPost;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
        new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
    List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),


        new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
            List.of("HTML", "CSS", "JavaScript", "React")),


        new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
            List.of("Python", "Machine Learning", "Data Analysis")),


        new JobPost(4, "Network Engineer", "Design and implement computer networks for efficient data communication", 5,
            List.of("Networking", "Cisco", "Routing", "Switching")),


        new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
            List.of("iOS Development", "Android Development", "Mobile App"))
            
    ));


    public List<JobPost> getallJobs(){
        return jobs;

    }

    public void addJob(JobPost job) {
        jobs.add(job);
        System.out.println(jobs);

}

    public void updateJob(JobPost jobpost) {
        for(JobPost jobPost1 : jobs){
            if (jobPost1.getPostId() == jobpost.getPostId()) {
                jobPost1.setPostProfile(jobpost.getPostProfile());
                jobPost1.setPostDesc(jobpost.getPostDesc());
                jobPost1.setReqExperience(jobpost.getReqExperience());
                
            }
        }
    }

    public void deleteJob(int postId) {
        for(JobPost jobPost : jobs){
            if(jobPost.getPostId() == postId)
            jobs.remove(jobPost);
        }
    }

   
}
