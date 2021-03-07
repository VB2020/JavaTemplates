package com.VB2020.Prototype;

public class BookFactory {
    Book book;

    public BookFactory(Book book) {
        this.book = book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    Book cloneRestaurant()
    {
        return (Book) book.copy();
    }
}
