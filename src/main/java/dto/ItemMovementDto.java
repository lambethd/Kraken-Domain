package dto;

import portfolio.RangeType;

public class ItemMovementDto {
    private Integer itemId;
    private Float percentageChange;
    private Long valueChange;
    private RangeType rangeType;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Float getPercentageChange() {
        return percentageChange;
    }

    public void setPercentageChange(Float percentageChange) {
        this.percentageChange = percentageChange;
    }

    public Long getValueChange() {
        return valueChange;
    }

    public void setValueChange(Long valueChange) {
        this.valueChange = valueChange;
    }

    public RangeType getRangeType() {
        return rangeType;
    }

    public void setRangeType(RangeType rangeType) {
        this.rangeType = rangeType;
    }
}
