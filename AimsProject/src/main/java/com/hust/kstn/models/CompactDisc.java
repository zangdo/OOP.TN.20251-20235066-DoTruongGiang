package com.hust.kstn.models;
import java.util.List;
import java.util.ArrayList;
public class CompactDisc extends Disc{
    private List<String> artists = new ArrayList<>();
    private List<String> directors = new ArrayList<>();
    private List<Track> tracks = new ArrayList<>();
    public CompactDisc(String title) {
        super(title);
    }
    public CompactDisc(String title, String genre, double price,List<String> artists, List<String> directors, List<Track> tracks) {
        super(title,genre,price);
        // Copying lists to avoid external reference issues
        for (String artist : artists) {
            this.artists.add(artist);
        }
        for (String director : directors) {
            this.directors.add(director);
        }
        for (Track track : tracks) {
            this.tracks.add(new Track(track.getTitle(), track.getLength()));
        }
    }
    public List<String> getArtists() {
        return artists;
    }
    public List<String> getDirectors() {
        return directors;
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
    public void play() {
        if(this.totalLength() <= 0) {
            System.out.println("ERROR: CD length is non-positive!");
            return;
        }
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD length: " + this.totalLength());
        for (Track track : this.tracks) {
            System.out.println("Playing track: " + track.toString());
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
        return String.format("CD %s [%d sec]%nArtists: %s%nDirectors: %s%nTracks:%n%s",
                super.toString(), this.totalLength(),
                artistsString.toString(), directorsString.toString(), tracksString.toString());
    }
}
