package com.lesson.my_exercises.visitor2;

public class Main {
    public static void main(String[] args) {
        SmartDevice[] smartDevices = {new SmartLight(), new Thermostat()};

        DeviceVisitor energyVisitor = new EnergyAuditVisitor();
        DeviceVisitor nightVisitor = new NightModeVisitor();

        for (SmartDevice smartDevice: smartDevices){
            smartDevice.accept(energyVisitor);
            smartDevice.accept(nightVisitor);
        }
    }
}
