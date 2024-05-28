package com.example.common.model;

import javax.persistence.Embeddable;

@Embeddable
public class CreditCardDetails {
    private String cardNumber;
    private String expirationDate;
    private String cvv;
    private String cardType;

    public CreditCardDetails(String cardNumber, String expirationDate, String cvv, String cardType) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.cardType = cardType;
    }

    // Getter and Setter methods

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
}
