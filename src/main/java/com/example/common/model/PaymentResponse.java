package com.example.common.model;

public class PaymentResponse {
    private String transactionId;
    private String status;

    public PaymentResponse(String transactionId, String status) {
        this.transactionId = transactionId;
        this.status = status;
    }

    // Getter and Setter methods

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
}
