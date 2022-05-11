package Casting;

public class StaticBinding {

	public static class A{
		 void add() {
			System.out.println("super class");
		}
	}
	public static class B extends A{
		 void add() {
			System.out.println("sub class");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("===========upcasting===========");
A b=new B();
b.add();
System.out.println("===========downcasting===========");
B c=(B)b;
c.add();
//c.add1();
	}

}
