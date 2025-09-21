package com.tnsif.arrays;

public class Jaggedarray {
	    public static void main(String[] args) {
	        // Declaring a jagged array
	        int[][] arr = { {11, 12, 13, 14, 15}, {16, 17, 18}, {19, 20}, {21} };

	        // Printing the jagged array
	        System.out.println("Jagged Array:");
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
