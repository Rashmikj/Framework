package Casting;

class A{
	static void add(){
		System.out.println("super class");
	}
}
class B extends A{
	static void add(){
		System.out.println("subclass");
	}
}
public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("up-casting");
		A v=new A();
		v.add();
A a=new B();
a.add();


System.out.println("down-casting");
B b=(B)a;
b.add();
//b.add1();




	}

}
