package com.lesson.mediator.q6;

// KULE (Mediator/Arabulucu) Şablonu
interface ControlTower {
    void registerAirplane(Airplane a);
    void requestLanding(Airplane a); // İniş izni isteme
}
