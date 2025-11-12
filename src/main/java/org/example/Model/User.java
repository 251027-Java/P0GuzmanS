package org.example.Model;

import java.util.List;

public class User {
    private int userId;
    private String name;
    private String email;
    private List<BookList> bookLists; // One-to-Many

    public User(String name, String email, int id) {
        this.name = name;
        this.email = email;
        this.userId = id;
    }

    public String getName() { return this.name; }
    public String getEmail() { return this.email; }
    public int getUserId() { return this.userId; }
    public List<BookList> getBookLists() { return this.bookLists; }
}
