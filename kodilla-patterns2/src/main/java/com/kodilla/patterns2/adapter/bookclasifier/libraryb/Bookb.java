package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

public class Bookb {
    private final String author;
    private final String title;
    private final int yearOfPublication;

    public Bookb(String author, String title, int yearOfPublication) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
