package StaticNonstatic;

public class Static {

	static int a=10;
	int b=20;
	
	static void m1() {
		System.out.println(a);
		Static a=new Static();
		
		System.out.println(a.b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 m1();
	}

}
