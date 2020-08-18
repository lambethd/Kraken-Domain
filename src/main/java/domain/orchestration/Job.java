package domain.orchestration;

import java.time.LocalDateTime;
import java.util.Map;

public class Job implements IJob {
    private String id;
    private JobStatus status;
    private int runeDay;
    private JobType jobType;
    private int progress;
    private String username;
    private LocalDateTime startTime;
    private LocalDateTime finishTime;
    private Map<String, Object> parameters;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public JobType getJobType() {
        return jobType;
    }

    @Override
    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    @Override
    public JobStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(JobStatus status) {
        this.status = status;
    }

    @Override
    public int getRuneDay() {
        return runeDay;
    }

    @Override
    public void setRuneDay(int runeDay) {
        this.runeDay = runeDay;
    }

    @Override
    public int getProgress() {
        return progress;
    }

    @Override
    public void setProgress(int progress) {
        this.progress = progress;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public LocalDateTime getStartTime() {
        return startTime;
    }

    @Override
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    @Override
    public LocalDateTime getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(LocalDateTime finishTime) {
        this.finishTime = finishTime;
    }

    @Override
    public Map<String, Object> getParameters() {
        return parameters;
    }

    @Override
    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }
}
