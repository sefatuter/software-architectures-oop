package com.lesson.my_exercises.visitor2;

public interface SmartDevice {
    void accept(DeviceVisitor visitor);
}
