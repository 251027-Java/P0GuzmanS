package org.example.Model;

import java.util.List;

public class BookList {
    private int listId;
    private String listName;
    private User user;  // Many-to-One (belongs to one user)
    private List<Book> books; // Many-to-Many

    public BookList(List<Book> list, int id, String name, User u) {
        this.listId = id;
        this.listName = name;
        this.user = u;
        this.books = list;
    }

    public int getListId() { return this.listId; }
    public String getListName() { return this.listName; }
    public List<Book> getBooks() { return this.books; }

}
