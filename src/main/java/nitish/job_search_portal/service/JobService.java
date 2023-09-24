package nitish.job_search_portal.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nitish.job_search_portal.model.Job;
import nitish.job_search_portal.repo.IJobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Service
public class JobService {
    @Autowired
    IJobRepo iJobRepo;

    public String postJob(Job job) {
        iJobRepo.save(job);
        return "Job added successfully";
    }

    public List<Job> getJobs() {
        return (List<Job>) iJobRepo.findAll();
    }
    @GetMapping("job/{id}")
    public Job getJobById( Long id) {
        return  iJobRepo.findById(id).get();
    }

    public String deleteById(Long id) {
        iJobRepo.deleteById(id);
        return "Job deleted  successfully";
    }

    public String postJobs(List<Job> jobs) {
        iJobRepo.saveAll(jobs);
        return "jobs added";
    }
}
