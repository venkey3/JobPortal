package com.JobPortal.SpringBoot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.JobPortal.SpringBoot.Model.JobPost;
import com.JobPortal.SpringBoot.Service.JobService;
import com.JobPortal.SpringBoot.repo.JobRepo;
@Controller
public class JobController {

    @Autowired
    private JobService service;

	@GetMapping({"home","/"})
	public String name() {
	    return "home";
	}

    @GetMapping("addjob")
    public String addjob(){
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        service.addjob(jobPost);
        return "success";
    }

    @GetMapping("viewalljobs")
    public String viewJobs(Model m)
    {

        List<JobPost> jobs= service.getallJobs();
        m.addAttribute("jobPosts", jobs);
        return "viewalljobs";
    }

}
