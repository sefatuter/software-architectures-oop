package com.lesson.my_exercises.command2;

public class BankAccount {
    private double balance;

    BankAccount(double balance){
        this.balance = balance;
    }

    void deposit(double amount){
        this.balance += amount; // Bakiye güncellendi
        System.out.println("Money deposit successful: +" + amount + " TL | Current Balance: " + balance + " TL");
    }
    void withdraw(double amount){
        this.balance -= amount; // Bakiye güncellendi
        System.out.println("Money withdraw successful: -" + amount + " TL | Current Balance: " + balance + " TL");
    }
    public double getBalance() {
        return balance;
    }
}
