package Pragrams;

public class PrintOvel_Consonants {

	public static void main(String[] args) {
		
		String s="the java is a programming the is";
		String[] str=s.split(" ");
		int count=0;
		for (int i = 0; i < str.length; i++) {
			count=1;
			for (int j = i+1; j < str.length; j++) {
				if (str[i]==str[j]) {
					count++;
					str[j]="0";
					
				}
			}
			
			if (count>1&&str[i]!="0") {
				System.out.println(str[i]+" "+count);
			}
		}
		
	}

}
