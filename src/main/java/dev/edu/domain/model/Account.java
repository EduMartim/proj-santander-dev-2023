package dev.edu.domain.model;

import java.math.BigDecimal;

public class Account {
    private String id;
    private long number;
    private String agency;
    private BigDecimal balance;
    private BigDecimal limit;

    //generate getter and setter

    public String getId() {
        return id;
    }

    public long getNumber() {
        return number;
    }

    public String getAgency() {
        return agency;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
