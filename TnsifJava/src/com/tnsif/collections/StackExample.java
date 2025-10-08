package com.tnsif.collections;
import java.util.Stack;
public class StackExample {
	public static void main(String[] args) {
	     Stack st=new Stack(); 
	     st.push("Neha"); 
	     st.push(101); 
	     st.push(true); 
	     st.push("Prem"); 
	     st.push(null); 
	     System.out.println(st); 
	     st.pop(); 
	     System.out.println(st); 
	     System.out.println(st.peek()); 
	     System.out.println(st); 
	     } 
	} 