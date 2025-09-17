package constructors;
class Demo1{
	void show() {
		System.out.println("This is default method");
	}
	void show(int a) {
		System.out.println("This is method with int value"+a);
	}
	void show(double b) {
		System.out.println("This is method with double values"+b);
	}
}
public class MethodOverload1 {
	public static void main(String args[]) {
		Demo1  d= new Demo1();
		d.show();
		d.show(10);
		d.show(20.0);
	}

}