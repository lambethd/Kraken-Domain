package portfolio;

import java.time.LocalDateTime;

public class TradeEntry {
    private LocalDateTime tradeEntryDate;
    private Integer quantity;
    private Float price;

    public TradeEntry() {
    }

    public TradeEntry(LocalDateTime tradeEntryDate, Integer quantity, Float price) {
        this.tradeEntryDate = tradeEntryDate;
        this.quantity = quantity;
        this.price = price;
    }

    public LocalDateTime getTradeEntryDate() {
        return tradeEntryDate;
    }

    public void setTradeEntryDate(LocalDateTime tradeEntryDate) {
        this.tradeEntryDate = tradeEntryDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
