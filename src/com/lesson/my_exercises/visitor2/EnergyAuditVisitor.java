package com.lesson.my_exercises.visitor2;

public class EnergyAuditVisitor implements DeviceVisitor{

    private int totalPower = 0;

    @Override
    public void visit(SmartLight smartLight) {
        System.out.println("Smart light power consumption: " + smartLight.powerConsumption);
        totalPower += smartLight.powerConsumption;
    }

    @Override
    public void visit(Thermostat thermostat) {
        System.out.println("Thermostat power consumption: " + thermostat.powerConsumption);
        totalPower += thermostat.powerConsumption;
    }

    public int getTotalPower() {
        return totalPower;
    }

}
