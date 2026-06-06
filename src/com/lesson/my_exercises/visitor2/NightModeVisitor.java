package com.lesson.my_exercises.visitor2;

public class NightModeVisitor implements DeviceVisitor{

    @Override
    public void visit(SmartLight smartLight) {
        System.out.println("Brightness is setting for night.");
        smartLight.setBrightness(smartLight.getBrightness() * 0.1);
    }

    @Override
    public void visit(Thermostat thermostat) {
        System.out.println("Temperature is being lowered.");
        thermostat.setTemperature(18);
    }

}

