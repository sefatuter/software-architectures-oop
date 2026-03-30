package com.lesson.march_30_q1;

// 1. Soyut Sınıf (İçinde Köprüyü barındırır)
public abstract class Shape {
    protected String type;

    // İŞTE KÖPRÜ (BRIDGE) BURASI! (Defterindeki -> oku)
    protected Color color;

    // Constructor Injection ile köprüyü bağlıyoruz
    public Shape(Color color, String type) {
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return "I am a " + color.log() + " " + type;
    }
}
