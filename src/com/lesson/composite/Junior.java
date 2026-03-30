package com.lesson.composite;

public class Junior extends Developer {

    public Junior(String name, DeveloperType type) {
        super(name, type);
    }

    @Override
    public void addDeveloper(Developer developer) {
        // Yaprağın altında dal olamaz! Bu yüzden hata fırlatıyoruz.
        throw new UnsupportedOperationException("Junior birinin altına eleman eklenemez!");
    }

    @Override
    public void removeDeveloper(Developer developer) {
        throw new UnsupportedOperationException("Junior birinin altından eleman silinemez!");
    }

    @Override
    public void print() {
        // Junior'un alt listesi olmadığı için sadece kendini yazdırır ve döngü biter.
        System.out.println("  -> " + type + " : " + name);
    }
}
