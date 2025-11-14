package com.hust.kstn;

public class DigitalVideoDisc {
    private String title;
    private String genre;
    private double price;
    private String director;
    private int length;

    public DigitalVideoDisc(String title) {
        this.title = title;
    }
    public DigitalVideoDisc(String title, String genre, double price, String director) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.director = director;
    }
    public DigitalVideoDisc(String title, String genre, double price, String director, int length) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.director = director;
        this.length = length;
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
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
}
