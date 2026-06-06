package com.lesson.my_exercises.command;

public class RemoteControl {

    private Command slot;

    public void setCommand(Command command){
        this.slot = command;
    }

    public void pressButton(){
        slot.execute();
    }
}
