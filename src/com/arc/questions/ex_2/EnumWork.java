package com.arc.questions.ex_2;

public class EnumWork {
    public enum Months {
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
    }

    public static void main(String[] args) {

        System.out.println();
        Months month = Months.JANUARY;

//        month = Months.FEBRUARY;

//        switch (month) {
//            case "JANUARY":
//                month = "January";
//        }

        switch (month) {
            case Months.JANUARY:
                System.out.println("ocak");
                month = Months.FEBRUARY;
            case Months.FEBRUARY:
                System.out.println("sb");
        }
    }
}
