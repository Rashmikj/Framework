package overriding;

class Vehicle{
	void sub() {
		System.out.println("super class");
	}
}
public class Bike2 extends Vehicle {
void sub() {
	System.out.println("sub class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Bike2 a=new Bike2();
 a.sub();
 Vehicle b=new Bike2();
 b.sub();
 Bike2 c=(Bike2) b;
 b.sub();
	}

}
