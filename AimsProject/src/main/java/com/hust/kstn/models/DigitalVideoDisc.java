package com.hust.kstn.models;

public class DigitalVideoDisc {
    private int id;
    private static int nbDigitalVideoDiscs = 0;
    private String title;
    private String genre;
    private double price;
    private String director;
    private int length;


    public DigitalVideoDisc(String title) {
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
        this.title = title;
    }
    public DigitalVideoDisc(String title, String genre, double price, String director) {
        this(title);
        this.genre = genre;
        this.price = price;
        this.director = director;
    }
    public DigitalVideoDisc(String title, String genre, double price, String director, int length) {
        this(title, genre, price, director);
        this.length = length;
    }
    @Override
    public String toString() {
        // Sử dụng String.format() để code sạch sẽ và dễ đọc hơn
        return String.format("DVD[%d] - [%s] - [%s] - [%d] - [%.2f$] - [%s]",
                this.id, this.title, this.genre, this.length, this.price, this.director);
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
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
}
