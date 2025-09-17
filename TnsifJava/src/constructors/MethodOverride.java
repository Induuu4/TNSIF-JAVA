package constructors;
class A{
		void display() {
			System.out.println("This is method A");
		}
}
class B extends A{
		void display() {
			System.out.println("This is method B");
		}
}
public class MethodOverride {
	public static void main(String args[]) {
		B b=new B();
		b.display();
	}
}
