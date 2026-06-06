package com.lesson.my_exercises.strategy2;

public class GrayscaleFilter implements ImageFilter{
    @Override
    public void applyFilter(String imageName) {
        System.out.println("Grayscale Filter Applied to " + imageName);
    }
}
