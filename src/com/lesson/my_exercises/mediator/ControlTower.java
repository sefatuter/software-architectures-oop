package com.lesson.my_exercises.mediator;

public interface ControlTower {
    void registerAirplane(Airplane a);
    void requestLanding(Airplane a);
}
