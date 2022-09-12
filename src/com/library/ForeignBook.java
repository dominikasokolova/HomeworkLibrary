package com.library;

public class ForeignBook extends Book{
    private String language;
    public ForeignBook(String name, String author, int pages) {
        super(name, author, pages);
        this.language = "English";
    }

    public ForeignBook(String name, String author, int pages, String language) {
        super(name, author, pages);
        this.language = language;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + language;
    }
}
