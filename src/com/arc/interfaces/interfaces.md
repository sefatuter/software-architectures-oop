# Java Interfaces: The Ultimate Contract

In Software Architecture, an **Interface** is one of the most powerful tools for creating loosely coupled, flexible, and testable systems.

## 1. What is an Interface?

An `interface` in Java is a **blueprint of behavior**. It is a collection of abstract methods (methods without a **body/code**).

*   **It is not a Class.** You cannot create an object from it (`new Interface()` is illegal).
*   **It is a Contract.** It defines **WHAT** must be done, but not **HOW** it should be done.
*   **Keywords:** We use `interface` to define it and `implements` to use it.

> **The Analogy: The Electrical Socket**
> Think of an Interface as a standard **Wall Socket**.
> *   The Socket (Interface) guarantees that electricity will come out if you plug something in.
> *   It does not care if you plug in a TV, a Laptop, or a Vacuum Cleaner (The Classes).
> *   As long as the device fits the plug (implements the interface), it works.

---

## 2. The Syntax

### Defining the Contract (The "What")
We define the rules. Any class that signs this contract MUST write code for these methods.

```java
public interface IPaymentMethod {
    // 1. All methods are 'public' and 'abstract' by default.
    // 2. No method body (no {}) allowed here.
    void pay(double amount);
    
    void refund(double amount);
}
```

### Signing the Contract (The "How")
Concrete classes "implement" the interface. They **must** override every method defined in the interface.

```java
// Implementation 1: Credit Card
public class CreditCard implements IPaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Visa/MasterCard.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded $" + amount + " to Card.");
    }
}

// Implementation 2: Bitcoin
public class BitcoinWallet implements IPaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Bitcoin Address.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunded $" + amount + " to Wallet.");
    }
}
```

---

## 3. The Power of Polymorphism

This is where Interfaces become essential for Architecture. You can write code that works with the *Interface*, not the specific class.

```java
public class Main {
    public static void main(String[] args) {
        
        // 1. Define the reference as the Interface
        IPaymentMethod myPayment;

        // 2. Assign a Credit Card object
        myPayment = new CreditCard();
        myPayment.pay(100.00); // Output: Paid using Visa/MasterCard.

        // 3. Switch to Bitcoin dynamically!
        // The variable 'myPayment' doesn't care. It just knows 'pay()' exists.
        myPayment = new BitcoinWallet();
        myPayment.pay(50.00);  // Output: Paid using Bitcoin.
    }
}
```

---

## 4. The "Multiple Inheritance" Solution

Java does **not** support Multiple Inheritance with Classes (a child cannot have two fathers). This causes the "Diamond Problem."

However, a class **CAN implement multiple Interfaces**. This allows a class to have multiple "skills" or "roles."

```java
interface IFlyable {
    void fly();
}

interface ISwimmable {
    void swim();
}

// A Duck can do BOTH
public class Duck implements IFlyable, ISwimmable {
    @Override
    public void fly() {
        System.out.println("The duck is flying.");
    }

    @Override
    public void swim() {
        System.out.println("The duck is swimming.");
    }
}
```

---

## 5. Interface vs. Abstract Class (Quick Comparison)

| Feature | Interface | Abstract Class |
| :--- | :--- | :--- |
| **Methods** | Only abstract methods (prior to Java 8). | Can have both abstract and concrete methods. |
| **Variables** | Only `static final` constants. | Can have normal variables (state). |
| **Inheritance** | A class can implement **multiple** interfaces. | A class can extend only **one** abstract class. |
| **Usage** | Use when defining a **Role** or **Capability** (e.g., `Runnable`, `Playable`). | Use when classes share a common **Core Identity** (e.g., `Vehicle`, `Animal`). |
| **Relationship** | "CAN-DO" relationship. | "IS-A" relationship. |

---

## Summary for Architects

1.  **Decoupling:** Interfaces separate the definition of a service from its implementation. The client code (`Main`) doesn't need to know how the service (`CreditCard`) works.
2.  **Testability:** You can easily create "Mock" or "Fake" implementations of an interface to test your system without using real data or databases.
3.  **Flexibility:** You can swap implementations (e.g., move from MySQL to PostgreSQL) without changing the business logic code, as long as both implement the same Interface.
