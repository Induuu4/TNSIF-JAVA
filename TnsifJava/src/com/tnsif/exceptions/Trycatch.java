package com.tnsif.exceptions;

public class Trycatch {
		public static void main(String[] args) {
		     String s=null;
		     try {
		    	 System.out.println(s.length())	;
		    	 }catch(Exception e) {
		    		 System.out.println("This is Catch");
		    	 }
		}
	}