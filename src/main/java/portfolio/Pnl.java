package portfolio;

import java.time.LocalDateTime;

public class Pnl {
    private LocalDateTime date;
    private Float pnl;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Float getPnl() {
        return pnl;
    }

    public void setPnl(Float pnl) {
        this.pnl = pnl;
    }
}
