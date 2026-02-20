package com.arc.oop.basics.ex_1;

public class Worker {

    public int no;
    public String name;
    public String lastName;
    public int experience;
    public double salary;

    // First constructor without parameter
    public Worker() {

    }
    // Second constructor with parameters
    // Using generate shortcut
    public Worker(int no, String name, String lastName, int experience, double salary) {
        this.no = no;
        this.name = name;
        this.lastName = lastName;
        this.experience = experience;
        this.salary = salary;
    }

    public void showWorkerInfo(){
        System.out.println("-----------Worker Info----------");
        System.out.println("No.: " + no);
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("Experience: " + experience);
        System.out.println("Salary: " + salary);
        System.out.println("--------------------------------");
    }

    public void makeRaise(double raise){
        System.out.println("--------------------------------");
        System.out.println("Raising " + raise);
        salary += raise;
        System.out.println("Total salary: " + salary);
        System.out.println("--------------------------------");

    }

    public void resetComputer(String operatingSystem, String user){
        System.out.println("--------------------------------");
        System.out.println(user + " is now resetting by " + operatingSystem + "...");
        System.out.println("--------------------------------");
    }
}
