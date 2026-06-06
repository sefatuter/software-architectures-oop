package com.lesson.my_exercises.flyweight2;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    private static final Map<String, Car> carTypes = new HashMap<>();

    public static Car getCarType(String carType, String brand, String color, int maxVelocity){
        String key = carType + "-" + brand + "-" + color + "-" + maxVelocity;

        if (!carTypes.containsKey(key)){
            carTypes.put(key, new CarType(carType,brand,color,maxVelocity));
            System.out.println("New car type created: " + carType);
        }

        return carTypes.get(key);
    }
}
