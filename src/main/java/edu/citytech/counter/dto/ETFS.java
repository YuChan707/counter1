package edu.citytech.counter.dto;
import io.micronaut.serde.annotation.SerdeImport;

@SerdeImport
public class ETFS {
    private int rank;
    private String symbol;
    private String fundName;
    private float price;
    private float quantRating;
    private float aumInBillion;
    private String frequency;
    private String yieldFwd;
    private String payOutDate;
    private String gpaETFDividends;
    private float expenseRatio;;

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getQuantRating() {
        return quantRating;
    }

    public void setQuantRating(float quantRating) {
        this.quantRating = quantRating;
    }

    public float getAumInBillion() {
        return aumInBillion;
    }

    public void setAumInBillion(float aumInBillion) {
        this.aumInBillion = aumInBillion;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getYieldFwd() {
        return yieldFwd;
    }

    public void setYieldFwd(String yieldFwd) {
        this.yieldFwd = yieldFwd;
    }

    public String getPayOutDate() {
        return payOutDate;
    }

    public void setPayOutDate(String payOutDate) {
        this.payOutDate = payOutDate;
    }

    public String getGpaETFDividends() {
        return gpaETFDividends;
    }

    public void setGpaETFDividends(String gpaETFDividends) {
        this.gpaETFDividends = gpaETFDividends;
    }

    public float getExpenseRatio() {
        return expenseRatio;
    }

    public void setExpenseRatio(float expenseRatio) {
        this.expenseRatio = expenseRatio;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "REITS{" +
                "rank=" + rank +
                ", symbol='" + symbol  +
                ", fundName='" + fundName + '\'' +
                ", price=" + price +
                ", quantRating=" + quantRating +
                ", aumInBillion=" + aumInBillion +
                ", frequency='" + frequency + '\'' +
                ", yieldFwd='" + yieldFwd + '\'' +
                ", payOutDate='" + payOutDate + '\'' +
                ", gpaETFDividends='" + gpaETFDividends + '\'' +
                ", expenseRatio=" + expenseRatio +
                '}';
    }
}
