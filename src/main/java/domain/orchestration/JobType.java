package domain.orchestration;

public enum JobType {
    Unknown,
    HistoricalDataLoader,
    DailyDataLoader,
    DashboardDataCreator,
    DailyGraphLoader,
    BuyingLimitLoader
}
