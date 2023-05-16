package com.example.bookManageSystem_CRUD;

public class Book {
    private String bookName;
    private int pages;
    private Author author;

    public Book(String bookName, int pages, Author author) {
        this.bookName = bookName;
        this.pages = pages;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPages() {
        return pages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
