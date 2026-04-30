package com.lesson.mediator;

public interface AirTraficControlTower {
    void requestTakeOff(Airplane airplane);
    void requestLanding(Airplane airplane);
}
