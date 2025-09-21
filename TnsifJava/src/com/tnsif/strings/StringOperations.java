 package com.tnsif.strings;

 public class StringOperations {
	    public static void main(String[] args) {
	        // String Operations
	        System.out.println("String Operations:");
	        String str1 = "Hello";
	        String str2 = "World";
	        System.out.println("Concatenation: " + str1 + " " + str2);
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Substring: " + str1.substring(1, 4));

	        // StringBuffer
	        System.out.println("\nStringBuffer Operations:");
	        StringBuffer stringBuffer = new StringBuffer("Hello");
	        System.out.println("Initial StringBuffer: " + stringBuffer);
	        stringBuffer.append(" World");
	        System.out.println("After append: " + stringBuffer);
	        stringBuffer.insert(6, " Beautiful");
	        System.out.println("After insert: " + stringBuffer);
	        stringBuffer.reverse();
	        System.out.println("Reversed StringBuffer: " + stringBuffer);

	        // StringBuilder
	        System.out.println("\nStringBuilder Operations:");
	        StringBuilder stringBuilder = new StringBuilder("Hello");
	        System.out.println("Initial StringBuilder: " + stringBuilder);
	        stringBuilder.append(" World");
	        System.out.println("After append: " + stringBuilder);
	        stringBuilder.insert(6, " Beautiful");
	        System.out.println("After insert: " + stringBuilder);
	        stringBuilder.reverse();
	        System.out.println("Reversed StringBuilder: " + stringBuilder);
	    }
	}