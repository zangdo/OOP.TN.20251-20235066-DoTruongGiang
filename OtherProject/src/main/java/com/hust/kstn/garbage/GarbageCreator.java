package com.hust.kstn.garbage;
import java.nio.file.Files;
import java.nio.file.Paths;


public class GarbageCreator {

    public static void main(String[] args) {
        String filename = "input.txt";
        byte[] inputBytes = { 0 };
        long startTime, endTime;
        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
            
            System.out.println("Starting string concatenation with '+' operator...");
            startTime = System.currentTimeMillis();
            
            String outputString = "";
            for (byte b : inputBytes) {
                outputString += (char)b;
            }
            
            endTime = System.currentTimeMillis();
            System.out.println("Time taken with '+' operator: " + (endTime - startTime) + " ms");
        } catch (java.io.IOException e) {
            System.err.println("Failed to read file: " + filename);
            e.printStackTrace();
        }
    }
}