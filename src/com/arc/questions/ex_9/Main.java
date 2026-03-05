package com.arc.questions.ex_9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ISmartDevice> myDevices = new ArrayList<>();

        myDevices.add(new SmartCamera("Camera"));
        myDevices.add(new SmartLight("Light"));
        // myDevices.add(new SmartThermostat("Thermostat"));

        SmartThermostat myThermostat = new SmartThermostat("Thermostat");
        myThermostat.setTemperature(25);

        myDevices.add(myThermostat);

        for(ISmartDevice n : myDevices){
            n.turnOn();
        }
        /*
         * ARCHITECTURAL NOTE: ACCESSING CLASS-SPECIFIC METHODS
         *
         * Scenario: If objects are already inside a generic list (List<ISmartDevice>),
         * the "ISmartDevice" reference can only see methods defined in the interface (turnOn/turnOff).
         * To access specific methods like 'setTemperature()', we have two approaches:
         *
         * METHOD 2: DOWNCASTING (Using 'instanceof')
         * -----------------------------------------
         * for(ISmartDevice n : myDevices) {
         *     n.turnOn();
         *     if (n instanceof SmartThermostat) {
         *         // Downcasting: Converting the generic interface back to the specific class
         *         SmartThermostat tempThermostat = (SmartThermostat) n;
         *         tempThermostat.setTemperature(22);
         *     }
         * }
         *
         * WHY METHOD 1 (CONFIGURATION BEFORE ADDING TO LIST) IS PREFERRED:
         * ----------------------------------------------------------------
         * In Software Architecture, we try to avoid Downcasting/instanceof as much as possible.
         *
         * 1. The "Box" Logic: Putting an object into a generic "Interface box" only to
         *    immediately "open the box" to see what's inside (instanceof) adds complexity
         *    and suggests that the abstraction might be weak.
         *
         * 2. Identity vs. Role:
         *    - SmartThermostat is the "Identity" (It knows about temperature).
         *    - ISmartDevice is the "Role" (It only knows about power).
         *
         * BEST PRACTICE:
         * Configure the object while it still maintains its "Identity" (as a SmartThermostat).
         * Once it is fully configured, hand it over to the system as a "Role" (ISmartDevice).
         *
         * SUMMARY:
         * The 'ISmartDevice' remote control does NOT have a temperature button.
         * If you need to change the temperature, you must interact with the object
         * while the system still recognizes it specifically as a 'SmartThermostat'.
         */
    }

}
