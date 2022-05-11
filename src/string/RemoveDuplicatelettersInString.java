package string;

import java.util.Iterator;

public class RemoveDuplicatelettersInString {
public static void main(String[] args) {
	
	String s1="rashmirascharan";
	
	
	char[] s=s1.toCharArray();
	int d = s.length;
	int visited=-1;
	for (int i = 0; i < s.length; i++) {
		int count=1;
		for (int j = i+1; j < s.length; j++) {
			if (s[i]==s[j]) {
				count++;
				//s[j]=0;
				d=visited;
				
			}
		}
		if (d==visited) {
			d=count;
		}
	}
	
}
}
