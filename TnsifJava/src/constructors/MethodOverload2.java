package constructors;
class Demo2{
	void show(int a) {
		System.out.println("This is method value is"+a);
	}
	void show(int a,String b) {
		System.out.println("This is method values are "+a +"and"+b);
	}
	void show(String a,int b) {
		System.out.println("This is method values are "+a +"and" +b);
	}
}
public class MethodOverload2 {
	public static void main(String args[]) {
		Demo2  d= new Demo2();
		d.show(1);
		d.show(10,"HI");
		d.show("Hello",40);
	}

}