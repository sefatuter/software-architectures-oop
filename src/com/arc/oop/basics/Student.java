package com.arc.oop.basics;

public class Student {

    public int id; // Creating variable inside class , property or field
    public String name;
    public String lastName;

    private String gender;

    // Method overloading
    // To make method overloading
    // 1- number of parameters different or
    // 2- parameter types should be different
    public Student() {
        System.out.println("Student constructor without parameter");
    }

    public Student(int id) {
        this.id = id;
        System.out.println("Student constructor with one parameter : " + this.id);
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Student constructor with two parameter : " + this.id + ", " + this.name);
    }

    // Constructor (Constructive method
    public Student(int id, String name, String lastName) {
        // this -> The class that we working on rn. // Student class
        this.id = id; // Assign the id variable that comes as a parameter to the id variable inside this class // Bu sınıfın içindeki id değişkenine parametre olarak gelen id değişkenini ata
        this.name = name; // this.name is actually Student Class's public String name;
        this.lastName = lastName;
        System.out.println("Student constructor called");
    }

    //Access modifiers private
    public Student(String gender) {
        this.gender = gender; // Yukarida tanimlanan gender'i gonderilen degere atmak
    }
    public void writeGender() {
        System.out.println("Gender: " + this.gender);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}