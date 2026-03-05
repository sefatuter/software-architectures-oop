# Encapsulation: The Shield of Data

**Encapsulation** is the process of wrapping data (variables) and code (methods) together as a single unit. In Software Architecture, it is primarily used for **Data Hiding**.

## 1. Core Concept
Encapsulation ensures that an object's internal state is hidden from the outside world. Interaction with the object is only possible through its **public interface** (Getters and Setters).

*   **Variables:** Should be declared as `private`.
*   **Methods:** Provide `public` getter and setter methods to modify and view the variable values.

---

## 2. Access Modifiers Summary
To achieve encapsulation, we use access modifiers to control visibility:

| Modifier | Visibility |
| :--- | :--- |
| **private** | Accessible only within the **same class**. (Best for data fields) |
| **default** | Accessible within the **same package**. |
| **protected** | Accessible in the **same package** and **subclasses**. |
| **public** | Accessible from **anywhere**. (Best for methods) |

---

## 3. Implementation Example

### The "Bank Account" Analogy
You cannot walk into a bank and manually change your balance on the computer. You must use an ATM or talk to a teller (The Setter) who validates your ID.

```java
public class BankAccount {
    // 1. Private fields (Data Hiding)
    private double balance;
    private String accountNumber;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // 2. Getter (Read-only access)
    public double getBalance() {
        return balance;
    }

    // 3. Setter with Validation (Controlled write access)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
}