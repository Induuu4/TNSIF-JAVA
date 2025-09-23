package com.tnsif.exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeyword {
    public static void main(String[] args) {
        try {
            readFile("example.txt");
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }

    public static void readFile(String filename) throws IOException {
        File file = new File(filename);
        FileReader reader = new FileReader(file);
        System.out.println("File read successfully.");
        reader.close();
    }
}