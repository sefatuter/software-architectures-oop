package com.lesson.decorator.april_13_q3;

public class Main {
    public static void main(String[] args) {
        // 1. Durum: Standart, çıplak nesne. Sadece "Shape: Circle" yazar.
        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        // 2. Durum: DECORATOR KULLANIMI
        // Matruşka bebekleri gibi iç içe geçiriyoruz!
        // Circle'ı üretiyoruz ve onu RedShapeDecorator kutusunun İÇİNE koyuyoruz.
        Shape redCircle = new RedShapeDecorator(new Circle());

        System.out.println("\nCircle of red border");
        // redCircle.draw() çağrıldığında zincirleme reaksiyon başlar:
        // Önce içindeki Circle kendini çizer (Shape: Circle)
        // Sonra Dışındaki RedShapeDecorator kendi görevini ekler (Border color red.)
        redCircle.draw();
    }
}