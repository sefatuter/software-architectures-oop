package com.lesson.my_exercises.decorator2;

public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sended via email : " + message);
    }
}
