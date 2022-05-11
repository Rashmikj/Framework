package string;

import java.util.Iterator;

public class CountsOFEachElementString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="rashmir";
         int []arr=new int[s.length()];
         char[] ch = s.toCharArray();
         for (int i = 0; i <s.length(); i++) {
        	 arr[i]=1;
        	 for (int j = i+1; j <s.length(); j++) {
				if (ch[i]==ch[j]) {
					arr[i]++;
					ch[j]='0';
					
				}
			}
			
		}
         for (int i = 0; i <arr.length; i++) {
			if (ch[i]!=' '&&ch[i]!='0') 
				System.err.println(ch[i]+" "+arr[i]);
			
		}
	}

}
