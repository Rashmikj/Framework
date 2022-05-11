package ThisKeyword;

public class ThisUsingnonstaticMethods {

	int a,b;
	
	void getValues(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	void print() {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisUsingnonstaticMethods s=new ThisUsingnonstaticMethods();
		s.getValues(10, 20);
		s.print();
		
 
	}

}
