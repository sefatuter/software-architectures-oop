package com.lesson.factory;

public class Main {
    public static void main(String[] args) {
        // 1. Factory'den bir tane üretim bandı oluşturuyoruz
        TransportFactory factory = new TransportFactory();

        // 2. "Bana kara yolu taşıtı ver" diyoruz.
        // Dikkat: Burada "new Truck()" demiyoruz! Factory bizim yerimize üretiyor.
        ITransport karaTasiti = factory.createTransport("KARA");
        karaTasiti.deliver();

        // 3. "Bana deniz yolu taşıtı ver" diyoruz.
        ITransport denizTasiti = factory.createTransport("DENIZ");
        denizTasiti.deliver();

        // MİMARİ NOT:
        // Eğer yarın "HAVA" (Uçak) yolu eklemek istersen:
        // Main sınıfına, taşıtın nasıl üretildiğine veya hangi sınıftan olduğuna dair
        // TEK BİR KOD bile eklemiyorsun.
        // Sadece TransportFactory sınıfına gidip bir "else if" ekliyorsun.
        // İşte buna "Open/Closed Principle" (Gelişime açık, değişime kapalı) diyoruz.
    }
}
