package Pragrams;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int r,temp,sum=0;
		int n=121;
		temp=n;
		
		while (n>0) {
			
			r=n%10;
			sum=(sum*10)+r;
			
			n=n/10;
			
		}
		if (temp==sum) {
			System.out.println("paliandrome");
		} else {
			System.out.println("not a paliandrome");
		} */
		
		int a,b,c=0;
		
		int n=231;
		b=n;
		while (n>0) {
			a=n%10;
			c=(c*10)+a;
			n=n/10;
		}
		System.out.println(c);
		if (b==c) {
			System.out.println("paliandrome");
		} else {
   System.out.println("not a paliandrome");
		}
	}

}
