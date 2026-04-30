package com.lesson.decorator.april_13_q3;

public abstract class ShapeDecorator implements Shape {
    // PROTECTED: Sadece miras alan alt sınıflar (RedShapeDecorator) görebilsin.
    // Bu değişken, içine koyduğumuz "asıl nesneyi" (Daireyi) tutar.
    protected Shape decoratedShape;

    // Constructor Injection: Dekoratör üretilirken içine bir şekil koymak ZORUNLUDUR.
    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    // Arayüzden gelen draw metodu...
    @Override
    public void draw() {
        // İŞTE SİHİR: Dekoratör kendi başına bir şey çizmez!
        // İşi, içindeki asıl nesneye devredir (Delegation).
        decoratedShape.draw();
    }
}