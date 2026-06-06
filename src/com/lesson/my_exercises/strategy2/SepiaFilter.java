package com.lesson.my_exercises.strategy2;

public class SepiaFilter implements ImageFilter{
    @Override
    public void applyFilter(String imageName) {
        System.out.println("Sepia Filter Applied to " + imageName);
    }
}
