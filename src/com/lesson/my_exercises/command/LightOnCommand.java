package com.lesson.my_exercises.command;

public class LightOnCommand implements Command{
    private Light ligt;

    public LightOnCommand(Light light){
        this.ligt = light;
    }

    @Override
    public void execute() {
        ligt.turnOn();
    }
}
