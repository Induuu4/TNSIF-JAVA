package com.tnsif.inheritance;
class Base{
	int a=10;
}
class Derived extends Base{
	int a=20;
	public void hello() {
		System.out.println(a);
		System.out.println(super.a);
	}
}

public class Superkey {
	public static void main(String args[]) {
		Derived d= new Derived();
		d.hello();
	}

}
