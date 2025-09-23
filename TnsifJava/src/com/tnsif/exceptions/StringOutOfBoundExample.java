package com.tnsif.exceptions;

public class StringOutOfBoundExample {
    public static void main(String[] args) {
        String str = "Hello";
        try {
            char c = str.charAt(10); // This will throw StringIndexOutOfBoundsException
            System.out.println("Character at index 10: " + c);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}