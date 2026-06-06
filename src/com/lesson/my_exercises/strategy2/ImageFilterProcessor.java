package com.lesson.my_exercises.strategy2;

public class ImageFilterProcessor {
    private ImageFilter imageFilter;

    public ImageFilterProcessor(ImageFilter imageFilter){
        this.imageFilter = imageFilter;
    }

    void setImageFilter(ImageFilter imageFilter){
        this.imageFilter = imageFilter;
    }

    void process(String imageName){
        imageFilter.applyFilter(imageName);
    }

}
