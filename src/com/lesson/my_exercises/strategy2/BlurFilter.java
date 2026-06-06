package com.lesson.my_exercises.strategy2;

public class BlurFilter implements ImageFilter{
    @Override
    public void applyFilter(String imageName) {
        System.out.println("Blur Filter Applied to " + imageName);
    }
}
