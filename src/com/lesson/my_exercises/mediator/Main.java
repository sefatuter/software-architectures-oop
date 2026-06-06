package com.lesson.my_exercises.mediator;

public class Main {
    public static void main(String[] args) {
        ControlTower kule = new AirportTower();

        CommercialPlane thy = new CommercialPlane("THY-1245", kule);
        CommercialPlane pgs = new CommercialPlane("PGS-1934", kule);

        thy.land();
    }
}
