package CompletePrograms;

import java.util.Iterator;

public class ARemoveDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {21,32,12,43,12,1,23,45,1};
		int count=0;
		for (int i = 0; i < a.length; i++) {
			count=1;
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					a[j]='0';
					count++;
				}
			}
			if (count>=1&&a[i]!='0') {
				System.out.print(a[i]+" ");
			}
		}
	}

}
