package com.lesson.my_exercises.visitor2;

public interface DeviceVisitor {
    void visit(Thermostat thermostat);
    void visit(SmartLight smartLight);
}
