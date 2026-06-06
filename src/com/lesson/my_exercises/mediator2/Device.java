package com.lesson.my_exercises.mediator2;

public abstract class Device {
    public HomeMediator homeMediator;

    public Device(HomeMediator homeMediator){
        this.homeMediator = homeMediator;
    }
}
