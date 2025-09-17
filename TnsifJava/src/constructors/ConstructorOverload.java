package constructors;
class Construct{
	int a;
	int b;
	Construct(){
		System.out.println("this is a construct with no parameters");
		
	}
	Construct(int x){
		a=x;
		System.out.println("this is a construct 2");		
	}
	Construct(int x,int y){
		a=x;
		b=y;
		System.out.println("this is a construct 3");
		
	}
	public void display() {
		System.out.println("a="+a);
		System.out.println("a="+b);		
	}

}
public class ConstructorOverload {
	public static void main(String args[]) {
		Construct obj1= new Construct();
		obj1.display();
		Construct obj2= new Construct(10);
		obj2.display();
		Construct obj3= new Construct(10,20);
		obj3.display();
		

	}
}
