package com.lesson.my_exercises.iterator2;

public class ParkingLotIterator implements Iterator{

    public Vehicle[] vehicles;
    private int index = 0;

    public ParkingLotIterator(Vehicle[] vehicles){
        this.vehicles = vehicles;
    }

    @Override
    public boolean hasNext() {
        return index < vehicles.length && vehicles[index] != null;
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return vehicles[index++];
        }
        return null;
    }
}
