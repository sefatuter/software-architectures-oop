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