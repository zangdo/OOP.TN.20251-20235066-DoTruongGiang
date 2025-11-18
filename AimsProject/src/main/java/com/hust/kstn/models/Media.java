package com.hust.kstn.models;

public class Media {
    private int id;
    private String title;
    private double price;
    private String genre;
    private static int nbMedias = 0;
    public Media(String title) {
        nbMedias++;
        this.id = nbMedias;
        this.title = title;
    }
    public Media(String title, String genre, double price) {
        this(title);
        this.genre = genre;
        this.price = price;
    }
    @Override
    public String toString() {
        return String.format("[%d] - [%s] - [%s] - [%.2f$]",
                this.id, this.title, this.genre, this.price);
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
    public String getGenre() {
        return genre;
    }
}
