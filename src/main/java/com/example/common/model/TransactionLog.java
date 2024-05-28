package com.example.common.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.math.BigDecimal;

@Entity
public class TransactionLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private CreditCardDetails cardDetails;
    private BigDecimal amount;
    private BigDecimal refundAmount;
    private BigDecimal additionalCharges;
    private String transactionId;
    private String status;
    private int failedAttempts;
    private String notes;

    public TransactionLog(CreditCardDetails cardDetails, BigDecimal amount, String transactionId, String status) {
        this.cardDetails = cardDetails;
        this.amount = amount;
        this.transactionId = transactionId;
        this.status = status;
        this.failedAttempts = 0;
        this.notes = "";
    }

    // Getter and Setter methods

    public CreditCardDetails getCardDetails() {
        return cardDetails;
    }

    public void setCardDetails(CreditCardDetails cardDetails) {
        this.cardDetails = cardDetails;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public BigDecimal getAdditionalCharges() {
        return additionalCharges;
    }

    public void setAdditionalCharges(BigDecimal additionalCharges) {
        this.additionalCharges = additionalCharges;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getFailedAttempts() {
        return failedAttempts;
    }

    public void setFailedAttempts(int failedAttempts) {
        this.failedAttempts = failedAttempts;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getCardType() {
        return this.cardDetails.getCardType();
    }
}
