package com.arc.interfaces;

public abstract class Employee implements Maaslar, Sigorta{

    private String firstName;
    public String lastName;
    private String socialSecurityNumber;
    public String number;
    private String tcKimlikNo;


    // three-argument constructor
    public Employee(String first, String last, String ssn) {
        firstName = first;
        lastName = last;
        socialSecurityNumber = ssn;
    }
    public void setFirstName(String first) {
        if (first.length() >= 3) {
            firstName = first;
        }
    }

    public String getFirstName() {
        return firstName;
    }

}
