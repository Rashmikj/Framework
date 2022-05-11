package Pragrams;

import java.util.Iterator;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="raar";
		/*for (int i = a.length()-1;i>=0; i--) { 
			System.out.print(a.charAt(i));
		}
	/*char[]	arr=a.toCharArray();
	for (int i = 0; i < arr.length; i++) {
		
	}*/
		
		String b="";
		for (int i = a.length()-1;i>=0; i--) { 
			b=b+a.charAt(i);
		}
		System.out.println(b);

		if(b.equals(a))
		{
			System.out.println("paliandrome");
		}
		else{
			System.out.println("not a paliandrome");
		}
	}
	

}
