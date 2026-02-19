package com.arc.interfaces;

public class Temizlikci extends Employee {

    public Temizlikci(String first, String last, String ssn) {
        super(first, last, ssn);
    }

    @Override
    public double maasHesapla() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'maasHesapla'");
    }

    @Override
    public double sigortaHesapla() {
        return 0;
    }
}
