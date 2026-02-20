package com.arc.oop.abstraction.ex_1;

public class Yazilimci extends Employee {

    public Yazilimci(String maas, String first, String last, String ssn) {
        super(first, last, ssn);
        System.out.println(maas);
        // TODO Auto-generated constructor stub
    }

    public Yazilimci(String first, String last, String ssn) {
        super(first, last, ssn);
        // TODO Auto-generated constructor stub
    }

}
