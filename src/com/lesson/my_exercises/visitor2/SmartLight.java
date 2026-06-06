package com.lesson.my_exercises.visitor2;

public class SmartLight implements SmartDevice{
    public double brightness = 100;
    public int powerConsumption = 250;

    @Override
    public void accept(DeviceVisitor visitor) {
        visitor.visit(this);
    }

    public double getBrightness() {
        return brightness;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setBrightness(double brightness) {
        this.brightness = brightness;
    }
}
