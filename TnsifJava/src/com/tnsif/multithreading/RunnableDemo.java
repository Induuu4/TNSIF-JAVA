package com.tnsif.multithreading;

public class RunnableDemo {
	public static void main(String args[]) {
		RunnableInf ri=new RunnableInf();
		Thread td=new Thread(ri);
		td.start();
	}

}
