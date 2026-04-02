package com.lesson.my_exercises.composite;

import java.util.ArrayList;
import java.util.List;
// component (ortak ata)
public class Folder implements FileSystemItem{
    private String name;
    private List<FileSystemItem> items = new ArrayList<>();

    public Folder(String name){
        this.name = name;
    }

    public void add(FileSystemItem item){
        items.add(item);
    }

    @Override
    public void calculateSize() {
        for (FileSystemItem item : items){
            item.calculateSize();
        }
    }
}
