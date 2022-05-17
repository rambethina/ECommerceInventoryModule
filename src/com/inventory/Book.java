package com.inventory;

import java.util.Arrays;

public class Book {

    private final String isbnNumber;
    private String title;
    private String author;
    private String category;
    private double price;
    private String[] reviews;

    public Book(String isbnNumber, String title, String author, String category, double price, String[] reviews) {
        this.title = title;
        this.isbnNumber = isbnNumber;
        this.author = author;
        this.category = category;
        this.price = price;
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", reviews=" + Arrays.toString(reviews) +
                '}';
    }

    public double getPrice() {
        return price;
    }
}
