package com.lesson.mediator.april_27_q5;

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
