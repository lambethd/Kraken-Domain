package domain.orchestration;

import java.time.LocalDateTime;
import java.util.Map;

public interface IJob {
    String getId();

    void setId(String id);

    JobType getJobType();

    void setJobType(JobType jobType);

    JobStatus getStatus();

    void setStatus(JobStatus status);

    int getRuneDay();

    void setRuneDay(int runeDay);

    int getProgress();

    void setProgress(int progress);

    String getUsername();

    void setUsername(String username);

    LocalDateTime getStartTime();

    void setStartTime(LocalDateTime startTime);

    LocalDateTime getFinishTime();

    void setFinishTime(LocalDateTime endTime);

    Map<String, Object> getParameters();

    void setParameters(Map<String, Object> parameters);
}
