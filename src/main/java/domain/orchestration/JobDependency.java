package domain.orchestration;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;

public class JobDependency {
    private JobType jobType;
    private String authScope;

    @DynamoDBAttribute
    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    @DynamoDBAttribute
    public String getAuthScope() {
        return authScope;
    }

    public void setAuthScope(String authScope) {
        this.authScope = authScope;
    }
}
