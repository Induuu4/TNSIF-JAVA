package com.tnsif.collections;
import java.util.HashSet;
public class Hashset {
	public static void main(String[] args) {
	     HashSet<String>h=new HashSet<String>();
         h.add("Asha"); 
         h.add("Ram"); 
         h.add("John"); 
         h.add("David"); 
         System.out.println(h); 
         h.remove("John"); 
         System.out.println(h); 
	}
}