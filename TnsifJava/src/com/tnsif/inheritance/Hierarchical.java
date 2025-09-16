package com.tnsif.inheritance;
class A {
	int a=10;
	int b=20;
}
class Add extends A{
	public void Addition() {
		System.out.println("this is Add"+(a+b));
	}
}
class Sub extends A{
	public void Subtraction() {
		System.out.println("this is sub"+(a-b));
	}
}
class Mul extends A{
	public void Multiplication() {
		System.out.println("this is Mul"+(a*b));
	}
}
public class Hierarchical {
	public static void main(String[] args) {
		
		Add a=new Add();
		Sub b=new Sub();
		Mul c=new Mul();
		a.Addition();
		b.Subtraction();
		c.Multiplication();
		}
}
