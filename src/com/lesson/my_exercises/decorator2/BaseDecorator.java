package com.lesson.my_exercises.decorator2;

abstract public class BaseDecorator implements Notifier{
    protected Notifier notifier;

    public BaseDecorator(Notifier notifier){
        this.notifier = notifier;
    }

    @Override
    public void send(String message) {
        notifier.send(message);
    }
}
