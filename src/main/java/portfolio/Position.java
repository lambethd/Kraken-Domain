package portfolio;

import domain.TrackedDocument;

public class Position extends TrackedDocument {
    private String id;
    private Integer itemId;
    private Integer quantity;
    private String username;
    private Float purchasePrice;

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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void addToQuantity(Integer quantityChange) {
        this.quantity += quantityChange;
    }

    public void addToTotalValue(Float valueChange) {
        this.purchasePrice += valueChange;
    }
}
