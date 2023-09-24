package org.example;

public class Book {
    private String name;
    private String author;
    private String isbn;
    private int yearPublished;

    public Book (String name, String author, String isbn, int yearPublished) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.yearPublished = yearPublished;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getYearPublished() {
        return yearPublished;
    }
}
