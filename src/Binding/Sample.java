package Binding;

import java.util.Iterator;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="rashmicharan";
		String b="";
		int count=0;
		
		char[] arr=a.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			count=1;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]&&arr[i]!=0) {
					count++;
					arr[j]=0;
					
				}
			}
			if (count>=1&&arr[i]!=0) {
				System.out.println(arr[i]);
			}
		}
	}
}
		
	


