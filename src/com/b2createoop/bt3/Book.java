package com.b2createoop.bt3;

public class Book {
    private final String name;
    private final Author author;
    private double price;
    private int qty = 0;

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = 0;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double p) {
        price = p;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int q) {
        qty = q;
    }

    public String toString() {
        return "Book: " + name + " " + author + " Price = " + price + " Qty = " + qty;
    }
}