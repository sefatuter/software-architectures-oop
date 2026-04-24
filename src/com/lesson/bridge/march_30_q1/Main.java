package com.lesson.bridge.march_30_q1;

// Bridge Design Pattern

public class Main {
    public static void main(String[] args) {
        // 1. "Kırmızı" köprüsü bağlanmış bir "Daire" inşa ediyoruz
        Shape circle = new Circle(new Red());
        System.out.println(circle.toString()); // Çıktı: I am a Red Circle

        // 2. "Mavi" köprüsü bağlanmış bir "Kare" inşa ediyoruz
        Shape square = new Square(new Blue());
        System.out.println(square.toString()); // Çıktı: I am a Blue Square

        // 3. "Yeşil" köprüsü bağlanmış bir "Üçgen" inşa ediyoruz
        Shape triangle = new Triangle(new Green());
        System.out.println(triangle.toString()); // Çıktı: I am a Green Triangle
    }
}
