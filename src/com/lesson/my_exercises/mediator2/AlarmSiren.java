package com.lesson.my_exercises.mediator2;

public class AlarmSiren extends Device{

    public AlarmSiren(HomeMediator homeMediator){
        super(homeMediator);
    }

    public void soundAlarm(){
        System.out.println("Alarm ringing.!!");
    }
}
