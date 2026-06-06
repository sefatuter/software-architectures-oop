package com.lesson.my_exercises.decorator2;

public class Main {
    public static void main(String[] args) {

        Notifier email = new EmailNotifier();
        email.send("scenario A");

        Notifier emailSmsSlack = new SlackDecorator(new SMSDecorator(new EmailNotifier()));
        emailSmsSlack.send("scenario B");

    }
}
