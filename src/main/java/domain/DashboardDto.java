package domain;

import dto.ItemMovementDto;

import java.time.LocalDateTime;
import java.util.List;

public class DashboardDto {
    private LocalDateTime created;
    private List<ItemMovementDto> topIncreasesByDailyValue;
    private List<ItemMovementDto> topIncreasesByDailyPercentage;
    private List<ItemMovementDto> topDecreasesByDailyValue;
    private List<ItemMovementDto> topDecreasesByDailyPercentage;

    private List<ItemMovementDto> topIncreasesByMonthlyValue;
    private List<ItemMovementDto> topIncreasesByMonthlyPercentage;
    private List<ItemMovementDto> topDecreasesByMonthlyValue;
    private List<ItemMovementDto> topDecreasesByMonthlyPercentage;

    private List<Integer> itemsToWatch;
    private List<Index> indexList;

    public List<ItemMovementDto> getTopIncreasesByDailyValue() {
        return topIncreasesByDailyValue;
    }

    public void setTopIncreasesByDailyValue(List<ItemMovementDto> topIncreasesByDailyValue) {
        this.topIncreasesByDailyValue = topIncreasesByDailyValue;
    }

    public List<ItemMovementDto> getTopIncreasesByDailyPercentage() {
        return topIncreasesByDailyPercentage;
    }

    public void setTopIncreasesByDailyPercentage(List<ItemMovementDto> topIncreasesByDailyPercentage) {
        this.topIncreasesByDailyPercentage = topIncreasesByDailyPercentage;
    }

    public List<ItemMovementDto> getTopDecreasesByDailyValue() {
        return topDecreasesByDailyValue;
    }

    public void setTopDecreasesByDailyValue(List<ItemMovementDto> topDecreasesByDailyValue) {
        this.topDecreasesByDailyValue = topDecreasesByDailyValue;
    }

    public List<ItemMovementDto> getTopDecreasesByDailyPercentage() {
        return topDecreasesByDailyPercentage;
    }

    public void setTopDecreasesByDailyPercentage(List<ItemMovementDto> topDecreasesByDailyPercentage) {
        this.topDecreasesByDailyPercentage = topDecreasesByDailyPercentage;
    }

    public List<ItemMovementDto> getTopIncreasesByMonthlyValue() {
        return topIncreasesByMonthlyValue;
    }

    public void setTopIncreasesByMonthlyValue(List<ItemMovementDto> topIncreasesByMonthlyValue) {
        this.topIncreasesByMonthlyValue = topIncreasesByMonthlyValue;
    }

    public List<ItemMovementDto> getTopIncreasesByMonthlyPercentage() {
        return topIncreasesByMonthlyPercentage;
    }

    public void setTopIncreasesByMonthlyPercentage(List<ItemMovementDto> topIncreasesByMonthlyPercentage) {
        this.topIncreasesByMonthlyPercentage = topIncreasesByMonthlyPercentage;
    }

    public List<ItemMovementDto> getTopDecreasesByMonthlyValue() {
        return topDecreasesByMonthlyValue;
    }

    public void setTopDecreasesByMonthlyValue(List<ItemMovementDto> topDecreasesByMonthlyValue) {
        this.topDecreasesByMonthlyValue = topDecreasesByMonthlyValue;
    }

    public List<ItemMovementDto> getTopDecreasesByMonthlyPercentage() {
        return topDecreasesByMonthlyPercentage;
    }

    public void setTopDecreasesByMonthlyPercentage(List<ItemMovementDto> topDecreasesByMonthlyPercentage) {
        this.topDecreasesByMonthlyPercentage = topDecreasesByMonthlyPercentage;
    }

    public List<Integer> getItemsToWatch() {
        return itemsToWatch;
    }

    public void setItemsToWatch(List<Integer> itemsToWatch) {
        this.itemsToWatch = itemsToWatch;
    }

    public List<Index> getIndexList() {
        return indexList;
    }

    public void setIndexList(List<Index> indexList) {
        this.indexList = indexList;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}
