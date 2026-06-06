package com.lesson.my_exercises.memento;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();

        doc.content = "Hey";
        Memento save = doc.save();

        System.out.println(doc.content);

        doc.content = "asdasd";

        doc.restore(save);

        System.out.println(doc.content);
    }
}
