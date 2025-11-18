package com.hust.kstn.garbage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {

    public static void main(String[] args) {
        String filename = "input.txt";
        byte[] inputBytes = { 0 };
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
            
            System.out.println("Starting string concatenation with StringBuilder...");
            startTime = System.currentTimeMillis();
            StringBuilder outputBuilder = new StringBuilder();
            for (byte b : inputBytes) {
                outputBuilder.append((char)b);
            }
            String outputString = outputBuilder.toString();
            
            endTime = System.currentTimeMillis();
            System.out.println("Time taken with StringBuilder: " + (endTime - startTime) + " ms");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}