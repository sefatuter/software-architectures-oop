package com.arc.questions.note_c2;

public class Main {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("Car");
        Vehicle truck = VehicleFactory.getVehicle("Truck");
        Vehicle bike = VehicleFactory.getVehicle("Bike");


        Test.testMethodStatic();

        Test2 mytest = new Test2();

        mytest.testMethod();


    }
}
