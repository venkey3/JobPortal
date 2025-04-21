package com.JobPortal.SpringBoot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.JobPortal.SpringBoot.Model.JobPost;
import com.JobPortal.SpringBoot.Service.JobService;
import com.JobPortal.SpringBoot.repo.JobRepo;
@RestController
public class JobController {

    @Autowired
    private JobService service;

	// @GetMapping({"home","/"})
	// public String name() {
	//     return "home";
	// }

    // @GetMapping("addjob")
    // public String addjob(){
    //     return "addjob";
    // }

    // @PostMapping("handleForm")
    // public String handleForm(JobPost jobPost){
    //     service.addjob(jobPost);
    //     return "success";
    // }

    @GetMapping("jobPosts")
    public List<JobPost> getallJobs()
    {

        // List<JobPost> jobs= service.getallJobs();
        // m.addAttribute("jobPosts", jobs);
        return service.getallJobs();
    }


    @PostMapping("jobPosts")
     public void addjob(@RequestBody JobPost jobpost){
        service.addjob(jobpost);
     }

    @PutMapping("jobPosts")
    public void updateJob(@RequestBody JobPost jobpost){
        service.updateJob(jobpost);
    }


    @DeleteMapping("jobPosts/{postId}")
    public String deleteJob(@PathVariable int postId ){
        service.deleteJob(postId);
                return "deleted";
    }

}
