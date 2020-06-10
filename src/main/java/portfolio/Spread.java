package portfolio;

import domain.TrackedDocument;
import org.springframework.data.annotation.Id;

public class Spread extends TrackedDocument {
    @Id
    private String id;
    private Integer itemId;
    private String username;
    private float lowerBound;
    private float upperBound;
    private float spreadSize;
    private float roi;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public float getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(float lowerBound) {
        this.lowerBound = lowerBound;
    }

    public float getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(float upperBound) {
        this.upperBound = upperBound;
    }

    public float getSpreadSize() {
        return spreadSize;
    }

    public void setSpreadSize(float spreadSize) {
        this.spreadSize = spreadSize;
    }

    public float getRoi() {
        return roi;
    }

    public void setRoi(float roi) {
        this.roi = roi;
    }
}
