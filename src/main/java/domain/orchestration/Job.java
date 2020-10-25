package domain.orchestration;

import com.amazonaws.services.dynamodbv2.datamodeling.*;

import java.time.LocalDateTime;
import java.util.Map;

@DynamoDBTable(tableName = "Job")
@DynamoDBTyped
public class Job {
    private String id;
    private JobStatus status;
    private int runeDay;
    private JobType jobType;
    private int progress;
    private String username;
    private LocalDateTime startTime;
    private LocalDateTime finishTime;
    private Map<String, Object> parameters;
    private String error;

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

    public JobStatus getStatus() {
        return status;
    }

    public void setStatus(JobStatus status) {
        this.status = status;
    }

    public int getRuneDay() {
        return runeDay;
    }

    public void setRuneDay(int runeDay) {
        this.runeDay = runeDay;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(LocalDateTime finishTime) {
        this.finishTime = finishTime;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
