package com.lesson.mediator;

public interface Airplane {
    void requestTakeOff();
    void requestLanding();
    void notifyAirTrafficControl(String message);
}
