package CompletePrograms;

import java.util.Iterator;

public class BReveseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s1="raar";
	String s2="";
	for(int i=s1.length()-1;i>=0;i--) {
		s2=s2+s1.charAt(i);
	}
	System.out.println(s2);
	
	if (s2.equals(s1)) {
		System.out.println("given string is a paliandrome");
	} else {
  System.out.println("given string is not a paliandrome");
	}
	}
	
}


