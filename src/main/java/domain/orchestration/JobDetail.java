package domain.orchestration;

import java.util.Dictionary;
import java.util.List;

public class JobDetail {
    private String id;
    private JobType jobType;
    private List<JobDependency> jobDependencies;
    private Dictionary<String, String> params;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public List<JobDependency> getJobDependencies() {
        return jobDependencies;
    }

    public void setJobDependencies(List<JobDependency> jobDependencies) {
        this.jobDependencies = jobDependencies;
    }

    public Dictionary<String, String> getParams() {
        return params;
    }

    public void setParams(Dictionary<String, String> params) {
        this.params = params;
    }
}
