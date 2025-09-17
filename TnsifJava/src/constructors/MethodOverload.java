package constructors;
class Demo{
	void show() {
		System.out.println("This is default method");
	}
	void show(int a) {
		System.out.println("This is a method with one value"+a);
	}
	void show(int a, int b) {
		System.out.println("This is method with two values"+a +"and" +b);
	}
}
public class MethodOverload {
	public static void main(String args[]) {
		Demo  d= new Demo();
		d.show();
		d.show(10);
		d.show(20,30);
	}

}
