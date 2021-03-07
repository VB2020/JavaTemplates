package com.VB2020.Prototype;


public class Book implements Copyable {
    private int id;
    private String bookName;
    private String bookAutor;

    public Book(int id, String bookName, String bookAutor) {
        this.id = id;
        this.bookName = bookName;
        this.bookAutor = bookAutor;
    }

    @Override
    public Object copy() {
        Book copy = new Book(id, bookName, bookAutor);
        return copy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAutor() {
        return bookAutor;
    }

    public void setBookAutor(String bookAutor) {
        this.bookAutor = bookAutor;
    }
}
