package com.lesson.my_exercises.iterator2;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();

        parkingLot.parkVehicle(new Vehicle("34 ABC 132"));
        parkingLot.parkVehicle(new Vehicle("06 BC 32"));
        parkingLot.parkVehicle(new Vehicle("44 AC 13"));

        Iterator iterator = parkingLot.createIterator();

        while (iterator.hasNext()){
            Vehicle vehicle = (Vehicle) iterator.next();
            System.out.println("Parked Vehicle Plate: " + vehicle.getPlate());
        }
    }
}
