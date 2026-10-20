package IsaVII.JobApp.repo;

import IsaVII.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {
    
    List<JobPost> jobPosts =new ArrayList<>(Arrays.asList(
            new JobPost(1,"Java Developer","Responsible for developing Java applications",3,Arrays.asList("Java","Spring Boot","Hibernate")),
            new JobPost(2,"Frontend Developer","Responsible for developing frontend applications",2,Arrays.asList("HTML","CSS","JavaScript","React")),
            new JobPost(3,"Data Scientist","Responsible for analyzing and interpreting complex data",4,Arrays.asList("Python","R","Machine Learning","Deep Learning")) ,
            new JobPost(4,"DevOps Engineer","Responsible for managing and automating the software development process",5,Arrays.asList("Docker","Kubernetes","CI/CD","AWS"))
    )); 
    
    public List<JobPost> getAllJobs() {
        
        return jobPosts;
    }
    
    public void addJob(JobPost jobPost) {
        jobPosts.add(jobPost);
        IO.println(jobPosts);
    }
    
}
