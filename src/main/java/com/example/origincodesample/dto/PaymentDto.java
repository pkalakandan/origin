package com.example.origincodesample.dto;

public class PaymentDto {

    private Long id = null;

    private String referenceNumber = null;

    private Integer bsb = null;

    private Integer accountNumber = null;

    private Integer amount = null;

    public PaymentDto id(Long id) {
        this.id = id;
        return this;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PaymentDto referenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
        return this;
    }


    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public PaymentDto bsb(Integer bsb) {
        this.bsb = bsb;
        return this;
    }


    public Integer getBsb() {
        return bsb;
    }

    public void setBsb(Integer bsb) {
        this.bsb = bsb;
    }

    public PaymentDto accountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public PaymentDto amount(Integer amount) {
        this.amount = amount;
        return this;
    }


    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }


}
