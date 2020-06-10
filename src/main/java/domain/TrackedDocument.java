package domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public abstract class TrackedDocument implements IDocument {
    private LocalDateTime lastUpdated;
    private String updatedBy;

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}
