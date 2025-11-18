package com.hust.kstn.models;

public class DigitalVideoDisc extends Disc {
    private String director;
    private int length;
    public DigitalVideoDisc(String title) {
        super(title);
    }
    public DigitalVideoDisc(String title, String genre, double price, String director, int length) {
        super(title, genre, price);
        this.length = length;
        this.director = director;
    }
    @Override
    public String toString() {
        // Sử dụng String.format() để code sạch sẽ và dễ đọc hơn
        return String.format("DVD %s [%d] - [%s]",
                super.toString(), this.length, this.director);
    }
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.length);
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
}
