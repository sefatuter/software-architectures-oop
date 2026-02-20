package com.arc.oop.abstraction.ex_1;

public abstract class Employee {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // three-argument constructor
    public Employee(String first, String last, String ssn) {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
    }

    public void getVoice(){
        System.out.println("Voice");
    }
}
