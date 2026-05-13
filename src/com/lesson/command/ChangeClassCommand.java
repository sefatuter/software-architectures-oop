package com.lesson.command;

public class ChangeClassCommand implements Command{
    private TV tv;

    public ChangeClassCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }
}
