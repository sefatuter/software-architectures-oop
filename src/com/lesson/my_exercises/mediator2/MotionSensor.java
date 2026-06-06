package com.lesson.my_exercises.mediator2;

public class MotionSensor extends Device{

    public MotionSensor(HomeMediator homeMediator){
        super(homeMediator);
    }

    public void detectMotion(){
        System.out.println("Motion detected.!!");
        homeMediator.trigger(this,"MOTION_DETECTED");
    }
}
