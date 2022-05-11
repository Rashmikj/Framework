package CompletePrograms;

public class APaliandrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n=1221;
  int c=0;
  int v=n;
  while (n!=0) {
	int m=n%10;
	c=(c*10)+m;
	n=n/10;
}
  if (v==c) {
	System.out.println("paliandrome");
} else {
System.out.println("not a paliandrome");
}

}
}