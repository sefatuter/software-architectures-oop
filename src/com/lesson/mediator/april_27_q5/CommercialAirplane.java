package com.lesson.mediator.april_27_q5;

public class CommercialAirplane implements Airplane{
    private AirTraficControlTower mediator;

    public CommercialAirplane(AirTraficControlTower mediator){
        this.mediator = mediator;
    }

    @Override
    public void requestTakeOff() {
        mediator.requestTakeOff(this);
    }

    @Override
    public void requestLanding() {
        mediator.requestLanding(this);
    }

    @Override
    public void notifyAirTrafficControl(String message) {
        System.out.println("Commercial Airplane " + message);
    }
}
