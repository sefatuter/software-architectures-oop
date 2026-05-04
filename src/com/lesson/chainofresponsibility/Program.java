package com.lesson.chainofresponsibility;

import java.math.BigDecimal;

public class Program {
    public static void main(String[] args) {
        MoneyWithdraw moneyWithdraw = new MoneyWithdraw("customerId", BigDecimal.valueOf(10000), "1111");

        Employee cashier = new Cashier();
        Employee executive = new Executive();
        Employee manager = new Manager();
        Employee regionManager = new RegionManager();

        cashier.SetNextApprover(executive);
        executive.SetNextApprover(manager);
        manager.SetNextApprover(regionManager);

        cashier.ProcessRequest(moneyWithdraw);
    }
}