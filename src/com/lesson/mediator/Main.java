package com.lesson.mediator;

public class Main {
    public static void main(String[] args) {
        AirTraficControlTower controlTower = new AirportControlTower();

        Airplane airplane1 = new CommercialAirplane(controlTower);
        Airplane airplane2 = new CommercialAirplane(controlTower);

        airplane1.requestTakeOff();
        airplane2.requestLanding();

    }
}
