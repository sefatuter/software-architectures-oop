package com.lesson.mediator;

public class AirportControlTower implements AirTraficControlTower{

    @Override
    public void requestTakeOff(Airplane airplane) {
        airplane.notifyAirTrafficControl("Request take off clearance");
    }

    @Override
    public void requestLanding(Airplane airplane) {
        airplane.notifyAirTrafficControl("Request landing clearance");
    }
}
