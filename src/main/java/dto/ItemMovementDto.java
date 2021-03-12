package dto;

public class ItemMovementDto {
    private Integer itemId;
    private Float dailyPercentageChange;
    private Long dailyValueChange;
    private Float monthlyPercentageChange;
    private Long monthlyValueChange;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Float getDailyPercentageChange() {
        return dailyPercentageChange;
    }

    public void setDailyPercentageChange(Float dailyPercentageChange) {
        this.dailyPercentageChange = dailyPercentageChange;
    }

    public Long getDailyValueChange() {
        return dailyValueChange;
    }

    public void setDailyValueChange(Long dailyValueChange) {
        this.dailyValueChange = dailyValueChange;
    }

    public Float getMonthlyPercentageChange() {
        return monthlyPercentageChange;
    }

    public void setMonthlyPercentageChange(Float monthlyPercentageChange) {
        this.monthlyPercentageChange = monthlyPercentageChange;
    }

    public Long getMonthlyValueChange() {
        return monthlyValueChange;
    }

    public void setMonthlyValueChange(Long monthlyValueChange) {
        this.monthlyValueChange = monthlyValueChange;
    }
}
