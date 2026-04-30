package com.lesson.mediator.april_27_q5;

public class Main {
    public static void main(String[] args) {
        AirTraficControlTower controlTower = new AirportControlTower();

        Airplane airplane1 = new CommercialAirplane(controlTower);
        Airplane airplane2 = new CommercialAirplane(controlTower);

        airplane1.requestTakeOff();
        airplane2.requestLanding();

    }
}
