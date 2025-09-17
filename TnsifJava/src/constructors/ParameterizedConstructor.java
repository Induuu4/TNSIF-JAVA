package constructors;
class Box{
	int a,b,c;
	Box(int x,int y,int z){
		a=x;
		b=y;
		c=z;
		System.out.println("This is Constructor");
	}
	public void volume()
	{
		int Vol=a*b*c;
		System.out.println(Vol);
	}
}

public class ParameterizedConstructor {
	public static void main(String args[]) {
		Box b= new Box(10,20,30);
		b.volume();
	}

}
