package com.hust.kstn.models;

public class Track {
    private String title;
    private int length; // length in seconds
    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
    public String getTitle() {
        return title;
    }
    public int getLength() {
        return length;
    }
    @Override
    public String toString() {
        return String.format("Track - [%s] - [%d sec]%n", this.title, this.length);
    }
}
