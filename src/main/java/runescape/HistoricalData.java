package runescape;

import domain.IDocument;

import java.time.LocalDateTime;

public class HistoricalData implements IDocument {
    private LocalDateTime date;
    private float price;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
