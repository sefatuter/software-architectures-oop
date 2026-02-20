package com.arc.questions.lab_q1;

import java.util.ArrayList;

public class LibrarySystem {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();

        Book book1 = new Book("1984", "George Orwell", "123456789", 0);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "987654321", 2);
        library.add(book1);
        library.add(book2);

        Member member1 = new Member("Alice", "M001");
        Librarian librarian = new Librarian("Bob", "L001");

        member1.borrowBook(book1);
        librarian.borrowBook(book2);

        librarian.addBook(library, new Book("Brave New World", "Aldous Huxley", "1122334455", 5));
        librarian.removeBook(library, book2);

        // member1.addBook(library, book2);

        member1.viewBorrowedBooks();
    }
}
