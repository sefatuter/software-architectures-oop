package com.lesson.my_exercises.composite;

public class Main {
    public static void main(String[] args) {
        File f1 = new File("file1");
        File f2 = new File("file2");

        Folder fl1 = new Folder("folder1");
        Folder fl2 = new Folder("folder2");
        Folder anafl = new Folder("Folder3");

        fl1.add(f1);
        fl2.add(f2);

        anafl.add(fl1);
        anafl.add(fl2);

        anafl.calculateSize();
    }
}
