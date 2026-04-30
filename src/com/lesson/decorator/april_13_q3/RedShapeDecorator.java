package com.lesson.decorator.april_13_q3;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        // super(...) -> Üst sınıfın (ShapeDecorator) constructor'ına şekli yolla ki
        // "protected Shape decoratedShape" değişkenine atansın.
        super(decoratedShape);
    }

    @Override
    public void draw() {
        // 1. ÖNCE ESKİ İŞİ YAP: Üst sınıfa git, içerdeki asıl şekli (Daireyi) çizdir.
        decoratedShape.draw();

        // 2. SONRA YENİ ÖZELLİĞİ EKLE: Orijinal koda dokunmadan kırmızı çerçeve ekle!
        setRedBorder(decoratedShape);
    }

    // Sadece bu sınıfa özel yeni bir yetenek
    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border color red.");
    }
}