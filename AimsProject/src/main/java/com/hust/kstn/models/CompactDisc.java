package com.hust.kstn.models;
import java.util.List;
import java.util.ArrayList;
public class CompactDisc {
    private int id;
    private static int nbCompactDiscs = 0;
    private String title;
    private String genre;
    private double price;
    private List<String> artists = new ArrayList<>();
    private List<String> directors = new ArrayList<>();
    private int length;
    private List<Track> tracks = new ArrayList<>();
    public CompactDisc(String title) {
        nbCompactDiscs++;
        this.id = nbCompactDiscs;
        this.title = title;
    }
    public CompactDisc(String title, String genre, double price, int length, List<String> artists, List<String> directors, List<Track> tracks) {
        this(title);
        this.genre = genre;
        this.price = price;
        this.length = length;
        this.artists = artists;
        this.directors = directors;
        for (Track track : tracks) {
            this.tracks.add(new Track(track.getTitle(), track.getLength()));
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
    public List<String> getArtists() {
        return artists;
    }
    public List<String> getDirectors() {
        return directors;
    }
    public int getLength() {
        return length;
    }
    public List<Track> getTracks() {
        return tracks;
    }
    public int totalLength() {
        int total = 0;
        for (Track track : this.tracks) {
            total += track.getLength();
        }
        return total;
    }
    public void addTrack(Track track) {
        for (Track t : this.tracks) {
            if (t.getTitle().equals(track.getTitle()) && t.getLength() == track.getLength()) {
                System.out.println("Track already exists!");
                return;
            }
        }
        this.tracks.add(track);
        System.out.println("Track added successfully!");
    }
    public void removeTrack(Track track) {
        int index = -1;
        for (int i = 0; i < this.tracks.size(); i++) {
            Track t = this.tracks.get(i);
            if (t.getTitle().equals(track.getTitle()) && t.getLength() == track.getLength()) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            this.tracks.remove(index);
            System.out.println("Track removed successfully!");
        } else {
            System.out.println("Track not found!");
        }
    }
    @Override
    public String toString() {
        StringBuilder artistsString = new StringBuilder();
        for (String artist : this.artists) {
            artistsString.append(artist).append(", ");
        }
        if (artistsString.length() > 0) {
            artistsString.setLength(artistsString.length() - 2);
        }
        StringBuilder directorsString = new StringBuilder();
        for (String director : this.directors) {
            directorsString.append(director).append(", ");
        }
        if (directorsString.length() > 0) {
            directorsString.setLength(directorsString.length() - 2); 
        }
        StringBuilder tracksString = new StringBuilder();
        for (Track track : this.tracks) {
            tracksString.append(track.toString());
        }
        return String.format("CD[%d] - [%s] - [%s] - [%d sec] - [%.2f$]%nArtists: %s%nDirectors: %s%nTracks:%n%s",
                this.id, this.title, this.genre, this.length, this.price,
                artistsString.toString(), directorsString.toString(), tracksString.toString());
    }
}
