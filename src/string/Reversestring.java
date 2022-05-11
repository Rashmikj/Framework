package string;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s="Rashmi";
  String rev="";
  char[] arr = s.toCharArray();
  System.out.println(arr);
  for(int i=0;i<arr.length;i++) {
	 rev=arr[i]+rev; 
  }
  System.out.println(rev);
	}

}
