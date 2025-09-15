package com.tnsif.second;

public class Variables {
	public void exampleLocalVariables() {
		int Id=1;
		String name="Priya";
		int age=23;
		double salary=24000.50;
		System.out.println("ID:"+Id);
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+salary);
		
	}
	public static void main(String args[]) {
		int localvar=10;
		System.out.println("Localvariable="+localvar);
		Variables obj = new Variables();
		System.out.println();
		System.out.println("Global Variables Example");
		obj.exampleLocalVariables();
	
	}

}