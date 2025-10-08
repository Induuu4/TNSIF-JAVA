package com.tnsif.collections;
import java.util.LinkedList;
public class Linkedlist{
	public static void main(String[] args) {
	LinkedList <String>ss=new LinkedList<String>();
	ss.addFirst("mumbai");
	ss.addFirst("Hyderabad");
	ss.addLast("Delhi");
	System.out.println(ss.getFirst());
	System.out.println(ss.getLast());
	System.out.println(ss);
	}
}