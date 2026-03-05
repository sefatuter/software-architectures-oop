# Polymorphism: One Interface, Many Forms

**Polymorphism** is derived from Greek words: *Poly* (many) and *Morph* (forms). In programming, it allows one interface (a reference or a method name) to be used for a general class of actions.

In Java, polymorphism is divided into two main categories:
1.  **Compile-time Polymorphism** (Static Binding)
2.  **Runtime Polymorphism** (Dynamic Binding) — *This is the most important for Architecture.*

---

## 1. Compile-time Polymorphism (Method Overloading)

This happens when multiple methods in the same class have the **same name** but **different parameters** (different signatures). The compiler determines which method to call at compile time.

### Example: A Calculator
```java
public class MathOperations {
    // Version 1: Two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Version 2: Three integers (Overloaded)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Version 3: Two doubles (Overloaded)
    public double add(double a, double b) {
        return a + b;
    }
}
```

---

## 2. Runtime Polymorphism (Method Overriding)

This is the heart of Software Architecture. It occurs when a child class provides a specific implementation of a method that is already defined in its parent class or interface.

The call to an overridden method is resolved at **Runtime** based on the **actual object**, not the reference type.

### The "Architectural" Example: Notification System
Imagine you are building an app that sends notifications. You don't want your main logic to care *how* the message is sent (Email, SMS, or Push).

#### Step 1: The Abstraction
```java
public interface INotification {
    void send(String message);
}
```

#### Step 2: The Concrete Implementations
```java
public class EmailNotification implements INotification {
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}

public class SmsNotification implements INotification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

public class PushNotification implements INotification {
    @Override
    public void send(String message) {
        System.out.println("Sending Push Notification to Mobile App: " + message);
    }
}
```

#### Step 3: The Execution (Polymorphism in Action)
```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // Polmorphic Reference: Parent/Interface type = Child object
        INotification myNotify = new EmailNotification();
        myNotify.send("Hello World"); // Logic works with Email

        // We can swap the object easily
        myNotify = new SmsNotification();
        myNotify.send("Hello World"); // The SAME variable now sends an SMS

        System.out.println("--- Processing a Queue ---");

        // The true power: Managing a list of different objects under one type
        List<INotification> notifications = new ArrayList<>();
        notifications.add(new EmailNotification());
        notifications.add(new SmsNotification());
        notifications.add(new PushNotification());

        for (INotification n : notifications) {
            // We don't know what 'n' is exactly, but we know it can 'send()'
            n.send("General Alert!"); 
        }
    }
}
```

---

## 3. Key Concepts to Remember

### A. Upcasting
Assigning a child object to a parent reference.
`Parent p = new Child();` — **This is always safe.**

### B. Downcasting
Assigning a parent reference back to a child type.
`Child c = (Child) p;` — **Warning:** This is risky and requires an explicit cast. Use `instanceof` to check first.

### C. Late Binding (Dynamic Binding)
The process where the computer decides which method to run at **runtime** rather than **compile time**. This is what allows `n.send()` to call different code for Email vs. SMS.

---

## 4. Why Polymorphism is Essential for Architecture

1.  **Open/Closed Principle (SOLID):** You can add a `WhatsAppNotification` class without changing the `Main` class or the existing notification logic. The system is *Open for Extension* but *Closed for Modification*.
2.  **Plug-and-Play Architecture:** You can treat components as "swappable parts." As long as they implement the same interface, they are interchangeable.
3.  **Code Reusability:** You write generic code that works on the "Base" type, and it automatically works for all future "Child" types.
4.  **Testing:** You can pass a "Mock" (fake) object that implements the interface during testing to avoid sending real emails or SMS.

---

## Summary Table

| Feature         | Static Polymorphism (Overloading) | Dynamic Polymorphism (Overriding)   |
|:----------------|:----------------------------------|:------------------------------------|
| **Binding**     | Compile-time (Early Binding)      | Runtime (Late Binding)              |
| **Location**    | Within the same class             | Between Parent and Child classes    |
| **Inheritance** | Not required                      | Required (Inheritance or Interface) |
| **Rule**        | Different parameters              | Same parameters, different logic    |
