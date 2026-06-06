package com.lesson.my_exercises.command2;

public class WithdrawTransaction implements Transaction{
    private BankAccount bankAccount;
    private double amount;

    WithdrawTransaction(BankAccount bankAccount, double amount){
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    @Override
    public void execute() {
        bankAccount.withdraw(amount);
    }

    @Override
    public void undo() {
        bankAccount.deposit(amount);
    }
}
