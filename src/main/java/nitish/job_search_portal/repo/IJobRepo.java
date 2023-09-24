package nitish.job_search_portal.repo;

import nitish.job_search_portal.model.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IJobRepo  extends CrudRepository<Job,Long> {

}
