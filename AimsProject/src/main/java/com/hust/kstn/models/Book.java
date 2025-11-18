package com.hust.kstn.models;
import java.util.ArrayList;
import java.util.List;
public class Book {
    private int id;
    private static int nbBooks = 0;
    private String title;  
    private String genre;
    private double price;
    private List<BookAuthor> authors = new ArrayList<>();
    private int length; // Số tuwf
    public Book(String title) {
        nbBooks++;
        this.id = nbBooks;
        this.title = title;
    }
    public Book(String title, String genre, double price, int length, BookAuthor... authors) {
        this(title);
        this.genre = genre;
        this.price = price;
        this.length = length;
        for (BookAuthor author : authors) {
            this.authors.add(author);
        }
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public double getPrice() {
        return price;
    }
    public List<BookAuthor> getAuthors() {
        return authors;
    }
    public int getLength() {
        return length;
    }
    @Override
    public String toString() {
        StringBuilder authorsString = new StringBuilder();
        for (BookAuthor author : this.authors) {
            authorsString.append(author.toString());
        }
        return String.format("Book[%d] - [%s] - [%s] - [%d pages] - [%.2f$]%nAuthors:%n%s",
                this.id, this.title, this.genre, this.length, this.price, authorsString.toString());
    }
}
