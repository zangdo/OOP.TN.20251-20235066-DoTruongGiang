package com.hust.kstn.models;

public class Disc extends Media {
    public Disc(String title) {
        super(title);
    }
    public Disc(String title, String genre, double price) {
        super(title, genre, price);
    }
    public void play() {
        // Default implementation (can be overridden by subclasses)
        System.out.println("Playing disc: " + this.getTitle());
    }
    
}
