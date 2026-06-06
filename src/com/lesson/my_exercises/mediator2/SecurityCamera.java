package com.lesson.my_exercises.mediator2;

public class SecurityCamera extends Device{

    public SecurityCamera(HomeMediator homeMediator){
        super(homeMediator);
    }

    public void startRecording(){
        System.out.println("Recording started.!!");
    }
}
