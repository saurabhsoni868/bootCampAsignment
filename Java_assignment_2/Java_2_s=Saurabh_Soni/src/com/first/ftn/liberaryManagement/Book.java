package com.first.ftn.liberaryManagement;

public class Book {
    String bookName;
    String bookAuthor;
    float bookPrice;

    Book(String name, String author, float price) {
        bookName = name;
        bookAuthor = author;
        bookPrice = price;
    }

    void getBookDetails() {
        System.out.println("Name of the Book: " + bookName);
        System.out.println("Author of the Book: " + bookAuthor);
        System.out.println("Price of the Book: " + bookPrice);
    }
}