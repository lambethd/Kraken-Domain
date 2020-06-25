package domain.settings;

public class FlippingRoiColourSetting implements ISetting {
    private Float minimumGreenValue;

    public Float getMinimumGreenValue() {
        return minimumGreenValue;
    }

    public void setMinimumGreenValue(Float minimumGreenValue) {
        this.minimumGreenValue = minimumGreenValue;
    }
}
