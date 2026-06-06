package com.lesson.my_exercises.decorator2;

public class SlackDecorator extends BaseDecorator{

    public SlackDecorator(Notifier wrappee){
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("Sended via Slack: " + message);
    }
}
