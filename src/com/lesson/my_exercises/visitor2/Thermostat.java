package com.lesson.my_exercises.visitor2;

public class Thermostat implements SmartDevice{
    public int temperature = 25;
    public int powerConsumption = 251;

    @Override
    public void accept(DeviceVisitor visitor) {
        visitor.visit(this);
    }

    public int getTemperature() {
        return temperature;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
