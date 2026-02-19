package com.arc.oop.static_example;

public class Main {
    public static void main(String[] args) {

        // It is the keyword that allows us to access variables or methods in a class directly
        // from the class name without creating an object from the class.

        // Normally we do this
        /*
        Student student = new Student();
        student.setName("Can");
        System.out.println(student.getName());
        */

//        Student.number = "12312321"; // Can accessible now without creating object.

//        System.out.println("Number: " + Student.number);

        Student.writeNumber("123453"); // Using Static Method

        System.out.println();

        Student student = new Student(); // Using without static
        student.setId(12L);
        student.studentInfo();

        System.out.println();

        Student student1 = new Student();
        System.out.println("------------------------");
        student1.number1 = "2313213"; // public we can access
        System.out.println(student1.number1); // prints 2313213
// Each time an object is created, the values assigned to it are unique to that object
        System.out.println("------------------------");
        Student student2 = new Student();
        System.out.println(student2.number1); // prints null

        // BUT! if we make static, it becomes a class-based variable !!!
        System.out.println();

        System.out.println("------------------------");
        student1.number = "2313213"; // public we can access
        System.out.println(student1.number); // prints 2313213
        System.out.println("------------------------");

        System.out.println(student2.number); // prints null
// Although the value was assigned through the student1 reference, it was also valid in the second generated object


    }
}