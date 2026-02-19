package com.arc.oop.static_example;

public class Student {

    private Long id;
    private String name;
    private String lastname;

    // instead of doing this public String number;
    public static String number; // After we put static
    // Statiğin bir başka görevi de değişkeni SINIF seviyesine çıkartıyor, NESNE seviyesi yerine!

    public String number1;

    // Creating Static method
    public static void writeNumber(String number) {
        System.out.println("Student number: " + number);
        // Anything non-static cannot be accessed in a static method (Variable or method)
//        System.out.println("id: " + getId()); // is not works
    }

    public void studentInfo() {
        System.out.println("id: " + getId()); // getId() can accessible here because it's not static
        System.out.println("name: " + getName());
        System.out.println("lastname: " + getLastname());
        writeNumber("Test");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
