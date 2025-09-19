package com.tnsif.abstraction;

public class AbstractionMain {

	public static void main(String[] args) {
		Square s=new Square(4);
		s.calArea();
		s.show();
		Rectangle r=new Rectangle(4,5);
		r.calArea();
		r.show();	
	}
}