# Dependency Injection (DI) Pattern: Computer Components Analogy

This document explains the concept of **Dependency Injection** using a `Computer` and `GraphicsCard` analogy. It demonstrates the difference between **Tight Coupling** (Bad Architecture) and **Loose Coupling** (Good Architecture).

---

## 1. The Problem: Tight Coupling (Without DI)

In this scenario, the `Computer` class is responsible for creating its own dependencies (`NvidiaGpu`). This creates a "hard dependency."

### Why is this bad?
*   **Rigid System:** The `Computer` is stuck with `NvidiaGpu`. You cannot change it to AMD without rewriting the `Computer` class code.
*   **Violates Open/Closed Principle:** To add a new feature (e.g., AMD support), you have to modify existing, tested code.
*   **Hard to Test:** You cannot test the `Computer` in isolation. If `NvidiaGpu` has a bug, the `Computer` test fails too.

### The "Bad" Code

```java
// 1. Concrete Dependency
public class NvidiaGpu {
    public void render() {
        System.out.println("Rendering graphics with Nvidia GPU...");
    }
}

// 2. The Consumer Class (Tightly Coupled)
public class Computer {
    // Direct dependency on a specific class
    private NvidiaGpu gpu;

    public Computer() {
        // ERROR: The class creates its own dependency using 'new'.
        // This Computer is forever glued to Nvidia.
        this.gpu = new NvidiaGpu(); 
    }

    public void playGame() {
        this.gpu.render();
    }
}
```

---

## 2. The Solution: Dependency Injection (With DI)

In this scenario, we use **Abstraction** (Interface) and **Polymorphism**. The `Computer` does not care about the brand; it only cares that the part fits the "slot" (Interface).

### Step 1: Create the Abstraction ( The Slot )
Define what the component should do, not how it does it.

```java
public interface GraphicsCard {
    void render();
}
```

### Step 2: Create Implementations ( The Parts )
Create different brands that implement the interface.

```java
public class NvidiaGpu implements GraphicsCard {
    @Override
    public void render() {
        System.out.println("Rendering graphics with Nvidia GPU...");
    }
}

public class AmdGpu implements GraphicsCard {
    @Override
    public void render() {
        System.out.println("Rendering graphics with AMD GPU...");
    }
}
```

### Step 3: Refactor the Computer ( The Consumer )
Remove the `new` keyword. Pass the dependency through the **Constructor**.

```java
public class Computer {
    // 1. Use the Interface, not the concrete class
    private GraphicsCard gpu;

    // 2. CONSTRUCTOR INJECTION
    // "Don't create the GPU inside. Ask for it from the outside."
    public Computer(GraphicsCard gpu) {
        this.gpu = gpu;
    }

    public void playGame() {
        // Polymorphism in action: 
        // It will run the render() method of whatever card was injected.
        this.gpu.render();
    }
}
```

---

## 3. The Execution: Wiring it Together (Main Class)

The `Main` class (or a Framework like Spring) acts as the **Assembler**. It decides which parts go into which computer.

```java
public class Main {
    public static void main(String[] args) {
        
        // Scenario 1: Customer wants an Nvidia Computer
        GraphicsCard nvidiaPart = new NvidiaGpu();          // Create the part
        Computer gamingPc = new Computer(nvidiaPart);       // Inject the part
        gamingPc.playGame(); 
        // Output: Rendering graphics with Nvidia GPU...


        // Scenario 2: Customer wants an AMD Computer
        GraphicsCard amdPart = new AmdGpu();                // Create the part
        Computer officePc = new Computer(amdPart);          // Inject the part
        officePc.playGame(); 
        // Output: Rendering graphics with AMD GPU...
        
        // NOTICE: We did not change a single line of code in the 'Computer' class!
    }
}
```

---

## Summary of Benefits

| Feature | Without DI (Bad) | With DI (Good) |
| :--- | :--- | :--- |
| **Coupling** | **Tight:** Classes are glued together. | **Loose:** Classes are independent. |
| **Flexibility** | Low: Must change code to swap parts. | High: Swap parts via configuration/Main. |
| **Testing** | Hard: Cannot test separately. | Easy: Can inject "Fake/Mock" objects for testing. |
| **Maintenance** | High Risk: Changing one class breaks others. | Low Risk: Changes are isolated. |

