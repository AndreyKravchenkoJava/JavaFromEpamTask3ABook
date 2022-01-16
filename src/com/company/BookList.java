package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class BookList {
    private List<Book> bookList = new ArrayList<>();
    public void addBook (Book b) {
        bookList.add(b);
    }
    public int parseYear (String year) {
        return Integer.parseInt(year);
    }
    public void listBooksAuthor (String author) {
        System.out.println("Список книг заданного автора: ");
        for (Book b : bookList) {
            if (b.getAuthor().equals(author)) {
                System.out.println(b.toString());
            }
        }
    }
    public void listPublishingHouse (String publishingHouse) {
        System.out.println("Список книг, выпущеных заданным издательством: ");
        for (Book b : bookList) {
            if (b.getPublishingHouse().equals(publishingHouse))
                System.out.println(b.toString());
        }
    }
    public void listBookYear (String year) {
        System.out.println("Список книг, выпущеных после заданного года: ");
        for (Book b : bookList) {
            if (parseYear(b.getYear().substring(2)) > parseYear(year)) {
                System.out.println(b.toString());
            }
        }
    }
}
