package nitish.job_search_portal.controller;

import nitish.job_search_portal.model.Job;
import nitish.job_search_portal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    JobService jobService;

    @PostMapping("job")
    public String postJob(@RequestBody Job job){
        return jobService.postJob(job);
    }
    @GetMapping("jobs")
    public List<Job> getJobs(){
        return jobService.getJobs();
    }
    @GetMapping("job/{id}")
   public Job getJobById(@PathVariable Long id){
        return jobService.getJobById(id);
   }
   @DeleteMapping("job/{id}")
   public String deleteJobById(@PathVariable Long id){
        return jobService.deleteById(id);
   }
   @PostMapping("jobs")
   public String postJobs(@RequestBody List<Job> jobs){
        return jobService.postJobs(jobs);
   }

}
