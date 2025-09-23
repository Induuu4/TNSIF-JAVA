package com.tnsif.exceptions;

public class Multiplecatches {
    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            System.out.println("Accessing array element at index 10: " + array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught general Exception: " + e.getMessage());
        }
    }
}
