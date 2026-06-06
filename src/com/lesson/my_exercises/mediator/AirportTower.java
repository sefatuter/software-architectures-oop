package com.lesson.my_exercises.mediator;

import java.util.ArrayList;
import java.util.List;

public class AirportTower implements ControlTower{

    private List<Airplane> airplanes = new ArrayList<>();

    @Override
    public void registerAirplane(Airplane a) {
        airplanes.add(a);
    }

    @Override
    public void requestLanding(Airplane senderPlane) {
        senderPlane.receiveMessage("Tower: Landing approved, you can land.");

        for (Airplane plane: airplanes){
            if (plane != senderPlane){
                plane.receiveMessage("Tower: Attention! Another plane is landing. Hold position.");
            }
        }

    }

}
