package Pragrams;

import java.util.Iterator;

public class REmoveDuplicateWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s="the java and java pro main little pro john";
 String[] str=s.split(" ");
  int count=0;
  for (int i = 0; i < str.length; i++) {
	  count=1;
	  for (int j = i+1; j < str.length; j++) {
		if (str[i].equals(str[j])) {
			str[j]="0";
			count++;
		}
	}
	if (count>1&&str[i]!="0") {
		System.out.println(str[i]+"="+count);
	}
}
	}

}
