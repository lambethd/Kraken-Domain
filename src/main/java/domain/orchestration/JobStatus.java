package domain.orchestration;

public enum JobStatus {
    Unknown,
    Pending,
    Started,
    Blocked,
    Completed,
    Failed,
    Cancelled
}
