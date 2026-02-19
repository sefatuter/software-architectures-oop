package com.arc.oop.encapsulation;

public class Worker {

    // These variables are only accessible in Worker class
    private long id;
    private String name;
    private String lastName;
    private int salary;

    // There are two-way to assign value these variables: Constructor -- Getter Setter (Capsulation)

    public  Worker() {

    }

    public Worker(long id, String name, String lastName, int salary) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Created using generate for id.

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary >= 1000 && salary <= 5000) this.salary = salary; // preventing direct modification of the variable
    }
}