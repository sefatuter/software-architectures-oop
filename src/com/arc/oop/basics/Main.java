package com.arc.oop.basics;

public class Main {
    public static void main(String[] args) {

        // Constructor (Constructive method)

        // We have class. To access class variables we need to create object using "new"
        Student student1 = new Student(); // without parameter
        Student student2 = new Student(1, "Jack", "Bauer"); // ClassName ObjName = new ClassName(); // ClassName() is constructor for Student Class
//        Student student3 = new Student(5);
//        Student student4 = new Student(3, "Jack");

        // Instead of doing here you can do this inside constructor
//        student1.id = 1;
//        student1.name = "Jack";
//        student1.lastName = "Bauer";

        System.out.println("Student Name: " + student2.name);

        // ACCESS MODIFIERS (ERİŞİM BELİRLEYİCİLERİ)
        /* public: accessible from anywhere, no restrictions
         * private: can only be accessed from within the class it is in

         * protected: can be accessed from within the class it is in and from subclasses that inherit that class
         */

        System.out.println();

//    student1.gender // is not accessible
        System.out.println(student1.getGender());
        Student student5 = new Student("Boy"); // without parameter
        student5.writeGender();


    }
}
