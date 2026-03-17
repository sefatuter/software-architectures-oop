package com.lesson.factory;

public class TransportFactory {

    // Bu metot bizim fabrikamızın üretim bandıdır.
    public ITransport createTransport(String type) {
        if (type.equalsIgnoreCase("KARA")) {
            return new Truck();
        } else if (type.equalsIgnoreCase("DENIZ")) {
            return new Ship();
        }

        // İstenen tip bulunamazsa null dön veya Hata (Exception) fırlat
        throw new IllegalArgumentException("Bilinmeyen taşıma tipi!");
    }
}
