package com.arc.questions.q_five;

public class Book implements AutoCloseable{
    String title;
    String author;
    static int numberOfBooks = 1;
    Book() {
        numberOfBooks++;
    }
    Book(String title) {
        this.title = title;
        numberOfBooks++;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        numberOfBooks++;
    }
    @Override
    public void close() throws Exception {
        numberOfBooks--;
    }
}