package com.tnsif.inheritance;
class Owner{
	int sal1=20000;
	int sal2=30000;
	int sal3=40000;
public void show() {
	System.out.println("i am the Owner");
}
}
class Manager extends Owner{
	public void Salary() {
		System.out.println("the salary of manager"+sal1);
	}
}
class Employee extends Manager{
	public void display() {
		System.out.println("the salary of Employee"+sal2);
	}
}
class Dailywager extends Manager{
	public void display2() {
		System.out.println("the salary of DailyWager"+sal3);
	}
}

public class Hybrid {
	public static void main(String args[]) {
		Owner m=new Owner();
		Employee e=new Employee();
		Dailywager d=new Dailywager();
		m.show();
		d.Salary();
		e.display();
		d.display2();
	
	}

}
