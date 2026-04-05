package com.lesson.my_exercises.composite2;

public class Main{
    public static void main(String[] args) {
        Manager ceo = new Manager("Tet");
        Manager cto = new Manager("ctot");

        Junior j1 = new Junior("J1");
        Junior j2 = new Junior("J2");

        ceo.add(j1);
        cto.add(j2);

        ceo.print();
        cto.print();
    }

}
