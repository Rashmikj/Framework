package StaticNonstatic;

class A{
	public static void sub() {
		System.out.println("parent class method");
	}
	
}
class B extends A{
	public static void sub() {
		System.out.println("child class method");
	}
}
public class StaticOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 B.sub();
	}

}
