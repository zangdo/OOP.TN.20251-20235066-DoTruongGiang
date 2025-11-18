package com.hust.kstn.models;
import java.util.ArrayList;
import java.util.List;
public class Book extends Media {
    private List<BookAuthor> authors = new ArrayList<>();
    private int length; // Số tuwf
    public Book(String title, String genre, double price, int length, BookAuthor... authors) {
        super(title, genre, price);
        this.length = length;
        //ko neen gan luon vi se bi trung dia chi o ngoai
        for (BookAuthor author : authors) {
            this.authors.add(author);
        }
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
        return String.format("Book %s - [%d words]%nAuthors:%n%s",
                super.toString(), this.length, authorsString.toString());
    }
}
