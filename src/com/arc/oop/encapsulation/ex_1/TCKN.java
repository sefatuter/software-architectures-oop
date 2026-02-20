package com.arc.oop.encapsulation.ex_1;

import java.util.Random;

public class TCKN {
    private Long id;
    private String birthPlace;
    private String tckn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getTckn() {
        return tckn;
    }

    public boolean control = true;

    public void setTckn(String tckn) { // Control
        if (tckn.length() == 11) {
            for (int i = 0; i < tckn.length(); i++) {
                char ch = tckn.charAt(i);
                if (!Character.isDigit(ch)) {
                    control = false;
                    break;
                }
            }
            if (control) {
                Random random = new Random(); // Using random
                int tollNum = random.nextInt(100);

                writeResult("Your Box Office Number: " + tollNum);
                this.tckn = tckn;
                control = false;
            } else {
                writeResult("Please enter a valid Tckn number.");
                control = true;
            }
        } else {
            writeResult("TCKN must contain 11 numbers!");
        }

    }

    public void writeResult(String answer) {
        System.out.println(answer);
    }
}
