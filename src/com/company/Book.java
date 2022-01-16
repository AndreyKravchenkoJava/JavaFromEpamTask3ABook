package com.company;

public class Book {
    {
        idGenerator++;
    }
    private static int idGenerator = 0;
    private int id = idGenerator;
    private String title;
    private String author;
    private String publishingHouse;
    private String year;
    private String numberPages;
    private String price;
    private String binding;
    public Book (String title, String author, String publishingHouse, String year, String numberPages, String price, String binding) {

        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.numberPages = numberPages;
        this.price = price;
        this.binding = binding;
    }
    public String getTitle () {
        return title;
    }
    public void setTitle (String title) {
        this.title = title;
    }
    public String getAuthor () {
        return author;
    }
    public void setAuthor (String author) {
        this.author = author;
    }
    public String getPublishingHouse () {
        return publishingHouse;
    }
    public void setPublishingHouse (String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }
    public String getYear () {
        return year;
    }
    public void setYear (String year) {
        this.year = year;
    }
    public String getNumberPages () {
        return numberPages;
    }
    public void setNumberPages (String numberPages) {
        this.numberPages = numberPages;
    }
    public String getPrice () {
        return price;
    }
    public void setPrice (String price) {
        this.price = price;
    }
    public String getBinding () {
        return binding;
    }
    public void setBinding (String binding) {
        this.binding = binding;
    }
    public String toString() {
        return "Book {" + " id " + id + ", title = " + title + ", author = " + author + ", publishingHouse = " + publishingHouse + ", year = " + year + ", numberPages = " + numberPages
                + ", price = " + price + ", biding = " + binding + "}";
    }
}
