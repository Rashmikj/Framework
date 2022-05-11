package CompletePrograms;

public class AAPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no=0;
boolean flag=true;
for (int i = 2; i <no; i++) {
	if (no%2==0) {
		flag=false;
	}
}
if (flag==true) {
	System.out.println("prime");
} else {
	System.out.println("not a prime");
}
	}

}
