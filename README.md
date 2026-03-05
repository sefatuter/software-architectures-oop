# software-architectures-oop

## OOP Concepts

### 1. Class
A **Class** is a user-defined **blueprint** or prototype used to create objects. It defines the data (**fields**) and behavior (**methods**).
*   **Critical:** A class is a **logical** structure only. It does **not** consume memory until an object is created.

### 2. Object
An **Object** is the concrete, physical version of a class that lives in **Heap memory**. Every object has three characteristics:
1.  **State:** The current data values (fields).
2.  **Behavior:** The actions it can perform (methods).
3.  **Identity:** A unique ID assigned by the JVM to distinguish it from others.

### 3. Object vs. Instance
They refer to the same thing, but the **emphasis** is different:
*   **Object:** Refers to the entity in memory (The "thing" itself).
*   **Instance:** Emphasizes the **relationship** to its class (e.g., *"This object is an **instance** of the Car class"*).

> **Summary:** There is no functional difference. "Object" is general; "Instance" points back to the origin class.

Here is the continuation of your notes. You can paste this directly below the "Object vs. Instance" section in your Markdown file. It covers everything you need to know about Constructors, including `super()`, `this()`, and constructor overloading, from an architectural perspective.

### 4. Constructors: The Object Builders
A **Constructor** is a special method that is automatically called when an object is created using the `new` keyword. Its primary purpose is to **initialize** the object's state (assign initial values to fields) before it is used.

**Golden Rules of Constructors:**
1.  **Same Name:** The constructor's name must exactly match the Class name.
2.  **No Return Type:** It does not return any value, not even `void`.
3.  **Automatic Invocation:** You cannot call a constructor manually like a normal method; it only runs once during the `new` operation.

---

#### A. Types of Constructors
There are two main types of constructors in Java:

**1. Default (No-Args) Constructor:**
If you don't write any constructor, Java automatically provides an invisible, empty one. However, if you write it yourself, you can define default values.
```java
public class Car {
    String model;

    // Default Constructor
    public Car() {
        this.model = "Unknown Model";
        System.out.println("A default car is created.");
    }
}
```

**2. Parameterized Constructor (Dependency Injection basics):**
This is used to provide specific values at the exact moment the object is born.
```java
public class Car {
    String model;
    int speed;

    // Parameterized Constructor
    public Car(String model, int speed) {
        this.model = model;  // 'this' refers to the current object's field
        this.speed = speed;
    }
}
```

---

#### B. Constructor Overloading
Just like methods, you can have **multiple constructors** in the same class, as long as they have different parameter lists. This gives the user (the `Main` class) options on how to create the object.

```java
public class User {
    String username;
    String email;

    // Option 1: Create user with only a username
    public User(String username) {
        this.username = username;
        this.email = "Not Provided";
    }

    // Option 2: Create user with both username and email
    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
```

---

#### C. Constructor Chaining: `this()`
To prevent code duplication when overloading constructors, one constructor can call another constructor within the **same class** using `this()`.

*   **Rule:** `this()` must always be the **first line** inside the constructor.

```java
public class Product {
    String name;
    double price;

    // Main Constructor (Does the actual work)
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Secondary Constructor (Calls the Main Constructor using this())
    public Product(String name) {
        // Automatically sets price to 0.0 without repeating code
        this(name, 0.0); 
    }
}
```

---

#### D. The `super()` Keyword: Inheritance Architecture
In Object-Oriented Programming, when a Child class is created, its Parent class **must be created first**. You cannot build the roof (Child) without building the foundation (Parent).

*   `super()` is used to call the **Parent class's constructor**.
*   **Rule 1:** `super()` must be the **first line** in the child's constructor.
*   **Rule 2:** If you don't write `super()`, Java secretly adds an empty `super();` on the first line anyway.
*   **Rule 3:** You cannot use `this()` and `super()` in the same constructor (because both demand to be on the first line).

**Example: How `super()` connects Parent and Child**

```java
// 1. The Parent Class
public class Vehicle {
    String brand;

    // Parent Constructor
    public Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle foundation built for: " + brand);
    }
}

// 2. The Child Class
public class Motorcycle extends Vehicle {
    boolean hasSidecar;

    // Child Constructor
    public Motorcycle(String brand, boolean hasSidecar) {
        // 1. Pass the 'brand' up to the Parent constructor FIRST!
        super(brand); 
        
        // 2. Then, initialize the Child's specific fields
        this.hasSidecar = hasSidecar;
        System.out.println("Motorcycle details added.");
    }
}

// 3. The Main Execution
public class Main {
    public static void main(String[] args) {
        Motorcycle myMoto = new Motorcycle("Harley", false);
        
        // Output Order:
        // 1. "Vehicle foundation built for: Harley"  (Because of super())
        // 2. "Motorcycle details added."             (Child finishes)
    }
}
```

**Architect's Note:** `super()` is strictly used for **Inheritance** (Classes), not Interfaces. Interfaces do not have constructors because they cannot hold state (variables that need initializing).

