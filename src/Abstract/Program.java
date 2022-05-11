package Abstract;

import java.util.Iterator;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="charandm";
		char[]arr=s.toCharArray();
            int[]freq=new int[s.length()];
            
           for (int i = 0; i <s.length(); i++) {
        	   freq[i]=1;
        	   for (int j = i+1; j < s.length(); j++) {
				if (arr[i]==arr[j]) {
					freq[i]++;
					arr[j]='0';
				}
			}
        	   
			
		}
           for (int i = 0; i <s.length(); i++) {
        	   if (arr[i]!=' '&&arr[i]!='0') {
   				System.err.println(arr[i]+" "+freq[i]);
   			}
		}
	
	}

}
