 package com.tnsif.collections;
 import java.util.*; 
        public class Vector1 
        { 
          public static void main(String aa[]) 
          { 
        	Vector<String> V=new Vector<String>();
  	        V.addElement("Delhi");
  	        V.addElement("Mumbai");
  	        V.add("Hyderabad");
  	        V.add("Vizag");
  	        System.out.println(V);
  	        V.remove(1);
  	        System.out.println(V.get(0));
          } 
      } 
