package com.hust.kstn.test;

import com.hust.kstn.models.CompactDisc;
import com.hust.kstn.models.Track;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompactDiscTest {
    public static void main(String[] args) {
        Track track1 = new Track("Numb", 185);
        Track track2 = new Track("Faint", 162);
        Track track3 = new Track("Breaking the Habit", 196);
        Track track4 = new Track("Somewhere I Belong", 213);

        
        List<Track> initialTracks = new ArrayList<>(Arrays.asList(track1, track2, track3));

        
        List<String> artists = new ArrayList<>(Arrays.asList("Linkin Park"));
        List<String> directors = new ArrayList<>(Arrays.asList("Don Gilmore"));


        
        System.out.println("--- 2. Testing Constructor and toString() ---");
        CompactDisc cd = new CompactDisc(
                "Meteora",
                "Nu Metal",
                15.99,
                2196,
                artists,
                directors,
                initialTracks
        );
        System.out.println("CD created successfully. Here is the information:");
        System.out.println(cd);


        System.out.println("\n--- 3. Verifying Composition (Deep Copy) ---");
        System.out.println("Now, let's modify the original 'initialTracks' list from the outside.");
        initialTracks.add(new Track("A new track added from outside", 100));
        System.out.println("Original list size is now: " + initialTracks.size());
        System.out.println("Let's print the CD again. Its internal track list should NOT be changed:");
        System.out.println(cd);
        System.out.println("==> Correct! The CD object is protected from external modifications.");


        System.out.println("\n--- 4. Testing addTrack() method ---");
        System.out.println("Adding a new track 'Somewhere I Belong'...");
        cd.addTrack(track4);
        System.out.println("CD after adding a new track:");
        System.out.println(cd);

        System.out.println("Trying to add an existing track 'Faint' again...");
        cd.addTrack(new Track("Faint", 162));
        System.out.println("CD's state remains unchanged:");
        System.out.println(cd);


        System.out.println("\n--- 5. Testing removeTrack() method ---");
        // Xóa một track tồn tại
        System.out.println("Removing the track 'Breaking the Habit'...");
        cd.removeTrack(track3);
        System.out.println("CD after removing the track:");
        System.out.println(cd);

        System.out.println("Trying to remove a non-existent track 'In The End'...");
        cd.removeTrack(new Track("In The End", 216));
        System.out.println("CD's state remains unchanged:");
        System.out.println(cd);


        System.out.println("\n--- 6. Testing totalLength() method ---");
        System.out.println("The current total length of the CD should be 185 + 162 + 213 = 560 seconds.");
        System.out.println("Calculated total length: " + cd.totalLength() + " seconds.");

        CompactDisc emptyCd = new CompactDisc("Empty Album");
        System.out.println("\nTotal length of an empty CD: " + emptyCd.totalLength() + " seconds.");
    }
}