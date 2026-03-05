package com.arc.oop.encapsulation.ex_2;

public class Main {
    public static void main(String[] args) {

        // 1. Create a new bank account
        BankAccount myAccount = new BankAccount("TR123456789");

        // 2. INCORRECT ACCESS (Compile Error)
        // If you uncomment the line below, the code will NOT compile.
        // myAccount.balance = 500000; // Error: balance has private access in BankAccount

        System.out.println("--- Initial State ---");
        System.out.println("Account Balance: $" + myAccount.getBalance());

        System.out.println("\n--- Deposit Operations ---");
        // 3. Valid Deposit
        myAccount.deposit(1500.0);

        // 4. Invalid Deposit (Validation Check)
        myAccount.deposit(-50.0); // Output: Deposit amount must be positive!

        System.out.println("\n--- Withdrawal Operations ---");
        // 5. Valid Withdrawal
        myAccount.withdraw(400.0);

        // 6. Invalid Withdrawal (Insufficient Funds Check)
        myAccount.withdraw(2000.0); // Output: Insufficient funds or invalid amount.

        System.out.println("\n--- Final State ---");
        // 7. Reading the final balance through Getter
        System.out.println("Final Balance: $" + myAccount.getBalance());
    }
}
