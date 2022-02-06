package com.example.origincodesample.dto;

import java.sql.Timestamp;

public class PaymentDto {
    private String referenceNumber;
    private Integer bsb;
    private Integer accountNumber;
    private Double amount;
    private Timestamp dateTime;
    private Double totalAmount;
    private static Integer GST = 10;



    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Integer getBsb() {
        return bsb;
    }

    public void setBsb(Integer bsb) {
        this.bsb = bsb;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Timestamp getDateTime() {
        return new Timestamp(System.currentTimeMillis());
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public static Integer getGST() {
        return GST;
    }

    public static void setGST(Integer GST) {
        PaymentDto.GST = GST;
    }
}
