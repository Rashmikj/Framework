package CompletePrograms;

public class BRemoveDuplicateLetterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="raarcaarmani";
		int count=0;
		char[] s=s1.toCharArray();
		for (int i = 0; i <s.length; i++) {
			count=1;
			for (int j = i+1; j <s.length; j++) {
				if (s[i]==s[j]) {
					s[j]='0';
					count++;
					
				}
			}
			if (count>=1&&s[i]!='0') {
				System.out.println(s[i]);
				
			}
		}
	}

}
