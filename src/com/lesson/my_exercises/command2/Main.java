package com.lesson.my_exercises.command2;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        TransactionManager manager = new TransactionManager();

        Transaction depositTransaction = new DepositTransaction(bankAccount,200);
        Transaction withdrawTransaction = new WithdrawTransaction(bankAccount, 100);

        manager.executeTransaction(depositTransaction);
        manager.executeTransaction(withdrawTransaction);


        manager.undoLastTransaction();
        manager.undoLastTransaction();
    }
}
