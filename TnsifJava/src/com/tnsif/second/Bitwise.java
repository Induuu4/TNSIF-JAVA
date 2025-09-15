package com.tnsif.second;

public class Bitwise {
	    public static void main(String[] args) {
	        int a = 5; 
	        int b = 3; 
            // Bitwise AND
	        int andResult = a & b; 
	        System.out.println("Bitwise AND of " + a + " and " + b + " is: " + andResult);
	        // Bitwise OR
	        int orResult = a | b; 
	        System.out.println("Bitwise OR of " + a + " and " + b + " is: " + orResult);
	        // Bitwise XOR
	        int xorResult = a ^ b; 
	        System.out.println("Bitwise XOR of " + a + " and " + b + " is: " + xorResult);
	        // Bitwise Complement
	        int complementResult = ~a;
	        System.out.println("Bitwise Complement of " + a + " is: " + complementResult);
	        // Left Shift
	        int leftShiftResult = a << 1; 
	        System.out.println("Left Shift of " + a + " by 1 is: " + leftShiftResult);
	        // Right Shift
	        int rightShiftResult = a >> 1;
	        System.out.println("Right Shift of " + a + " by 1 is: " + rightShiftResult);
	    }

}