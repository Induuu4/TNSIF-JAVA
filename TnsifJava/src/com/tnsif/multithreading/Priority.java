package com.tnsif.multithreading;

public class Priority {
	public static void main(String args[]) {
		MultiPriority m1=new MultiPriority();
		MultiPriority m2=new MultiPriority();
		m1.setPriority(1);
		m2.setPriority(10);
		m1.start();
		m2.start();
		
	}

}
