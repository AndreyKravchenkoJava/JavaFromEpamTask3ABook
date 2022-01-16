package com.company;

public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("Украина", "Кравченко", "Тополь", "2021", "300", "1000", "Кожа");
        Book b2 = new Book("Россия", "Кравченко", "Тополь", "2015", "500", "500", "Кожа");
        Book b3 = new Book("Америка", "Шевченко", "Титово", "2011", "200", "700", "Кожа");
        Book b4 = new Book("Германия", "Колягин", "Слобожанское", "2007", "400", "900", "Кожа");
        Book b5 = new Book("Франция", "Швыдкая", "Слобожанское", "2010", "500", "400", "Кожа");

        BookList newList = new BookList();
        newList.addBook(b1);
        newList.addBook(b2);
        newList.addBook(b3);
        newList.addBook(b4);
        newList.addBook(b5);
        newList.listBooksAuthor("Кравченко");
        newList.listPublishingHouse("Слобожанское");
        newList.listBookYear("2007");
    }
}
