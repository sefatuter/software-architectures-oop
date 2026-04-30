package com.lesson.mediator.april_27_q5;

public interface Airplane {
    void requestTakeOff();
    void requestLanding();
    void notifyAirTrafficControl(String message);
}
