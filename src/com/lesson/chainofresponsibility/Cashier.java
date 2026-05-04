package com.lesson.chainofresponsibility;

import java.math.BigDecimal;

public class Cashier extends Employee {
    @Override
    public void ProcessRequest(MoneyWithdraw req) {
        if (req.Amount.compareTo(BigDecimal.valueOf(20000)) <= 0) {
            System.out.println(this.getClass().getSimpleName() + " withdrawal confirmed by #" + req.Amount);
        } else if (NextApprover != null) {
            System.out.println(req.getAmount() + " the transaction amount " + this.getClass().getSimpleName() + " exceed the limit, the transaction was sent to a manager");

            NextApprover.ProcessRequest(req);
        }
    }
}