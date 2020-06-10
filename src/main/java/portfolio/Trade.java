package portfolio;

import com.fasterxml.jackson.annotation.JsonFormat;
import domain.TrackedDocument;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class Trade extends TrackedDocument {
    @Id
    private String id;
    private Integer itemId;
    private Integer requestQuantity;
    private Float requestPrice;
    private String username;
    private LocalDateTime requestTime;
    private TradeStatus tradeStatus;
    private BuySell buySell;
    private Integer currentQuantity;
    private Float currentTotalPrice;

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

    public Integer getRequestQuantity() {
        return requestQuantity;
    }

    public void setRequestQuantity(Integer requestQuantity) {
        this.requestQuantity = requestQuantity;
    }

    public Float getRequestPrice() {
        return requestPrice;
    }

    public void setRequestPrice(Float requestPrice) {
        this.requestPrice = requestPrice;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDateTime getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(LocalDateTime requestTime) {
        this.requestTime = requestTime;
    }

    public TradeStatus getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(TradeStatus tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public BuySell getBuySell() {
        return buySell;
    }

    public void setBuySell(BuySell buySell) {
        this.buySell = buySell;
    }

    public Integer getCurrentQuantity() {
        return currentQuantity == null ? 0 : currentQuantity;
    }

    public void setCurrentQuantity(Integer currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public Float getCurrentTotalPrice() {
        return currentTotalPrice;
    }

    public void setCurrentTotalPrice(Float currentTotalPrice) {
        this.currentTotalPrice = currentTotalPrice;
    }
}
