# Abstraction: Managing System Complexity

**Abstraction** is a process of hiding the implementation details and showing only functionality to the user. It reduces complexity and allows you to focus on **what** an object does instead of **how** it does it.

> **The Analogy: The Coffee Machine**
> You interact with a button (the abstract interface). You don't need to know the internal water temperature or the pressure of the pump to get a coffee. The "how" is hidden; the "what" (make coffee) is exposed.

---

## Version 1: Abstract Classes (Partial Abstraction)

An **Abstract Class** is a class that cannot be instantiated (you cannot use `new`). It is used to provide a common "template" for a group of related classes.

### Key Characteristics:
*   Use the `abstract` keyword.
*   Can have **Abstract Methods** (no body, must be implemented by children).
*   Can have **Concrete Methods** (regular methods with code).
*   Can have **Fields** (state/variables).

### Code Example: Document Printer System
```java
// Abstract Class provides a template
public abstract class BasePrinter {
    protected String printerName;

    public BasePrinter(String printerName) {
        this.printerName = printerName;
    }

    // Concrete Method: Every printer turns on the same way (Shared Logic)
    public void powerOn() {
        System.out.println(printerName + " is warming up...");
    }

    // Abstract Method: Every printer prints differently (Specific Logic)
    public abstract void printDocument(String content);
}

// Subclass 1: Inkjet
public class InkjetPrinter extends BasePrinter {
    public InkjetPrinter(String name) { super(name); }

    @Override
    public void printDocument(String content) {
        System.out.println("Using ink cartridges to print: " + content);
    }
}

// Subclass 2: Laser
public class LaserPrinter extends BasePrinter {
    public LaserPrinter(String name) { super(name); }

    @Override
    public void printDocument(String content) {
        System.out.println("Using toner and heat to print: " + content);
    }
}
```

---

## Version 2: Interfaces (Full Abstraction)

An **Interface** is a 100% abstract contract. It defines a **capability** or a **role** that a class can play.

### Key Characteristics:
*   A class can implement **multiple** interfaces.
*   By default, all methods are `public abstract`.
*   Interfaces cannot hold state (variables).
*   Perfect for **Loose Coupling**.

### Code Example: Data Exporter
```java
public interface IDataExporter {
    void export(String data);
}

public class PdfExporter implements IDataExporter {
    @Override
    public void export(String data) {
        System.out.println("Converting data to PDF format...");
    }
}

public class ExcelExporter implements IDataExporter {
    @Override
    public void export(String data) {
        System.out.println("Converting data to .xlsx cells...");
    }
}
```

---

## Version 3: The "Architect" Level (Combining Both)

In high-level architecture, we often use an **Interface** to define the "Goal" and an **Abstract Class** to handle the "Shared Boilerplate Code."

### Code Example: Database System
```java
// 1. The Interface (The Goal)
interface IDatabase {
    void connect();
    void query(String sql);
}

// 2. The Abstract Class (Shared Logic/Boilerplate)
abstract class BaseDatabase implements IDatabase {
    @Override
    public void connect() {
        // Common logic for all databases
        System.out.println("Logging connection attempt at " + System.currentTimeMillis());
        establishPhysicalConnection();
    }

    // Force children to define the physical connection
    protected abstract void establishPhysicalConnection();
}

// 3. The Concrete Class (Specific implementation)
class MySqlDatabase extends BaseDatabase {
    @Override
    protected void establishPhysicalConnection() {
        System.out.println("Connecting via MySQL Driver on Port 3306");
    }

    @Override
    public void query(String sql) {
        System.out.println("Running MySQL Syntax: " + sql);
    }
}
```

---

## Abstract Class vs. Interface: Summary Table

| Feature               | Abstract Class                                 | Interface                                   |
|:----------------------|:-----------------------------------------------|:--------------------------------------------|
| **Abstraction Level** | 0 to 100% (Partial)                            | 100% (Full)                                 |
| **Inheritance**       | A child can extend only **ONE**.               | A class can implement **MANY**.             |
| **Core Idea**         | **Identity:** What the object **is**.          | **Capability:** What the object **can do**. |
| **Variables**         | Can have final, non-final, static, non-static. | Only `static final` constants.              |
| **Methods**           | Can have constructors and private methods.     | No constructors.                            |

---

## Why Abstraction Matters in Architecture?

1.  **Decoupling:** High-level modules (like `Main`) should not depend on low-level modules (like `MySqlDatabase`). Both should depend on Abstractions (`IDatabase`).
2.  **Extensibility:** You can add a `MongoDbDatabase` class later without changing the existing code.
3.  **Security:** By only exposing the Interface, you protect the internal complex logic from accidental misuse.
4.  **Teamwork:** One developer can write the code that *uses* the interface, while another developer writes the code that *implements* it.
