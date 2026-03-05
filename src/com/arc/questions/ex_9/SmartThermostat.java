package com.arc.questions.ex_9;

public class SmartThermostat extends BaseDevice{

    private int temperature;

    public SmartThermostat(String deviceName) {
        super(deviceName);
    }

    public void setTemperature(int temperature){
        if(temperature >= 15 && temperature <= 30) {
            this.temperature = temperature;
            System.out.printf("Temperature set to %d\n", temperature);
        } else {
            System.out.println("Enter temperature between 15 - 30.");
        }
    }

    @Override
    public void turnOn() {
        System.out.println("Smart Thermostat is Turned On.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Thermostat is Turned Off.");
    }
}
