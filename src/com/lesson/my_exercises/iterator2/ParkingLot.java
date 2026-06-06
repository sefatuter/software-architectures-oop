package com.lesson.my_exercises.iterator2;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot implements Aggregate{

    Vehicle[] vehicles = new Vehicle[5];
    private int count = 0;

    void parkVehicle(Vehicle vehicle){
        if (count < vehicles.length){
            vehicles[count] = vehicle;
            count++;
            System.out.println(vehicle.getPlate() + " parked successfully.");
        } else {
            System.out.println("Parking lot is full!");
        }
    }

    @Override
    public Iterator createIterator() {
        return new ParkingLotIterator(this.vehicles);
    }

}
