package com.tnsif.abstraction;

public class Rectangle extends Shape {
	private int height=2,width=10;
	public Rectangle(int height,int width) {
		this.height=height;
		this.width=width;
	}
        void calArea() {
        	super.area=height*width;
        }
}