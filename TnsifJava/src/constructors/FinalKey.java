package constructors;
class Keys{
	final int a=10;
	final public void show() {
		System.out.println("the value of a=" +a);
		System.out.println("this is final method");
	}
}
final public class FinalKey{
	public static void main(String args[]) {
		Keys k=new Keys();
		k.show();
	}

}
