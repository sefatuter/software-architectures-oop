package com.lesson.chainofresponsibility;

import java.math.BigDecimal;

public class MoneyWithdraw {
    public String CustomerId;
    public BigDecimal Amount;
    public String AccountId;

    public MoneyWithdraw(String customerId, BigDecimal amount, String accountId) {
        CustomerId = customerId;
        Amount = amount;
        AccountId = accountId;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String customerId) {
        CustomerId = customerId;
    }

    public BigDecimal getAmount() {
        return Amount;
    }

    public void setAmount(BigDecimal amount) {
        Amount = amount;
    }

    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String accountId) {
        AccountId = accountId;
    }
}