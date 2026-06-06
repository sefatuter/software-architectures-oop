package com.lesson.my_exercises.command2;

public class DepositTransaction implements Transaction{
    private BankAccount bankAccount;
    private double amount;

    DepositTransaction(BankAccount bankAccount, double amount){
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    @Override
    public void execute() {
        bankAccount.deposit(amount);
    }

    @Override
    public void undo() {
        bankAccount.withdraw(amount);
    }
}
