package org.example.Model;

public class Book {
    private long bookId;
    private String title;
    private String author;
    private double rating;

    public Book(int id, String title, String author, double rating) {
        this.bookId = id;
        this.title = title;
        this.author = author;
        this.rating = rating;
    }

    public long getBookId() { return this.bookId; }
    public String getTitle() { return this.title; }
    public String getAuthor() { return this.author; }
    public double getRating() { return this.rating; }
}
