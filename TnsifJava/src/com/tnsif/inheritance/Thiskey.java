package com.tnsif.inheritance;
class Hello{
	int x=20;
	public void demo() {
		int x=30;
		System.out.println(x);
		System.out.println(this.x);
	}
	}
public class Thiskey {
	public static void main(String[] args) {
		Hello h= new Hello();
		h.demo();
	}

}
