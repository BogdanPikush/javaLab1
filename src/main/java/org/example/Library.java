package org.example;

import java.util.List;
import java.util.ArrayList;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // create new book
    public void addBook(Book book) {
        books.add(book);
    }

    // get all book
    public void getAllBook() {
        for (Book book : books) {
            System.out.println("Name: " + book.getName() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn() + ", Publication Year: " + book.getYearPublished());
            System.out.println();
        }
    }

    // find book by name
    public void findBookByName(String name) {
        boolean bookFound = false;
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(name)) {
                System.out.println("Book found with name: " + name);
                System.out.println("Name: " + book.getName() + " Author " + book.getAuthor() + " ISBN " + book.getIsbn() + " Publication Year " + book.getYearPublished());
                bookFound = true;
            }
        }

        if (!bookFound) {
            System.out.println("Book not found with name: " + name);
        }
    }

    // delete book by isbn
    public void deleteBookByIsbn(String isbn) {
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Book with ISBN " + isbn + " deleted.");
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }
}
