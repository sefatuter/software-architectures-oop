package com.lesson.my_exercises.command;
/*
- Strategy deseninde algoritmalar aynı işi farklı yollarla yapar
(Örn: Hepsi ödeme yapar ama biri PayPal, diğeri Kredi Kartı ile).-

- Command deseninde ise komutlar tamamen farklı işler yapabilir
(Biri lambayı açar, diğeri TV'yi kapatır, diğeri müziği başlatır).
Kumanda sadece execute() der, gerisine karışmaz.
 */
public class Main {
    public static void main(String[] args) {

        Light livingRoomLight = new Light();
        Command turnOnLight = new LightOnCommand(livingRoomLight);
        RemoteControl remote = new RemoteControl();

        remote.setCommand(turnOnLight);
        remote.pressButton();
    }
}
