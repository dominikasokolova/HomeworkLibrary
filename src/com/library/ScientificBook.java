package com.library;

public class ScientificBook extends Book{
    private String scientificArea;
    public ScientificBook(String name, String author, int pages, String scientificArea) {
        super(name, author, pages);
        this.scientificArea = scientificArea;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + scientificArea;
    }
}
