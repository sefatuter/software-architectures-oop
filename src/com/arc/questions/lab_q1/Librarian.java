package com.arc.questions.lab_q1;

import java.util.ArrayList;

public class Librarian extends Member {

    // Constructor
    public Librarian(String name, String memberId) {
        super(name, memberId);
    }

    // Method to add a book
    public void addBook(ArrayList<Book> library, Book book) {
        library.add(book);
        System.out.println("Book added by Librarian: " + book.getTitle());
    }

    // Method to remove a book
    public void removeBook(ArrayList<Book> library, Book book) {
        if (library.contains(book)) {
            library.remove(book);
            System.out.println("Book removed by Librarian: " + book.getTitle());
        } else {
            System.out.println("Book not found in the library: " + book.getTitle());
        }
    }

}
