package com.lesson.my_exercises.composite;

public class File implements FileSystemItem{
    private String name;

    public File(String name){
        this.name = name;
    }

    @Override
    public void calculateSize() {
        System.out.println(name + " Size : 10KB");
    }
}
