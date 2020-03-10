package dto;

import domain.RiskFactorType;
import domain.TradeType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.Date;

@Document
public class RiskFactorDto implements IDocument {
    @Id
    private String id;
    private RiskFactorType riskFactorType;
    private TradeType tradeType;
    private String tradeIdentifier;
    private double value;
    private Date calculationDate;

    public RiskFactorDto() {
        calculationDate = Date.from(Instant.now());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RiskFactorType getRiskFactorType() {
        return riskFactorType;
    }

    public void setRiskFactorType(RiskFactorType riskFactorType) {
        this.riskFactorType = riskFactorType;
    }

    public TradeType getTradeType() {
        return tradeType;
    }

    public void setTradeType(TradeType tradeType) {
        this.tradeType = tradeType;
    }

    public String getTradeIdentifier() {
        return tradeIdentifier;
    }

    public void setTradeIdentifier(String tradeIdentifier) {
        this.tradeIdentifier = tradeIdentifier;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Date getCalculationDate() {
        return calculationDate;
    }

    public void setCalculationDate(Date calculationDate) {
        this.calculationDate = calculationDate;
    }
}
