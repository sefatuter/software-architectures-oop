package com.lesson.my_exercises.strategy2;

public class Main {
    public static void main(String[] args) {

        ImageFilterProcessor processor = new ImageFilterProcessor(new GrayscaleFilter());
        processor.process("manzara.png");

        processor.setImageFilter(new BlurFilter());
        processor.process("manzara.png");
    }
}
