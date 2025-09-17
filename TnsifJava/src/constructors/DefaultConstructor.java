package constructors;
class Sample{
	int x=1, y=2, z=3;
	Sample(){
		System.out.println("This is Constructor");
	}
	public void show() {
		int vol=x*y*z;
		System.out.println(vol);
		
	}
}

public class DefaultConstructor {
	public static void main(String args[]) {
		Sample s= new Sample();
		s.show();
	}
}
