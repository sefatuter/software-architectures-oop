package com.lesson.my_exercises.mediator;

public class CommercialPlane implements Airplane{
    private String name;
    private ControlTower tower;

    public CommercialPlane(String name, ControlTower tower){
        this.name = name;
        this.tower = tower;
        this.tower.registerAirplane(this);
    }

    public void land() {
        System.out.println(name + " -> Tower: Request landing.");
        tower.requestLanding(this);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println(name + " heard: " + msg);
    }
}
