package com.lesson.chainofresponsibility;

public abstract class Employee {
    protected Employee NextApprover;

    public void SetNextApprover(Employee employee) {
        NextApprover = employee;
    }

    public abstract void ProcessRequest(MoneyWithdraw req);
}