package CompletePrograms;

public class Aprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=13;
		int m=0,flag=0;
		m=n/2;
		if (n==0||n==1) {
			System.out.println("not a prime number");
		} else {
         for (int i = 2; i <=m; i++) {
        	 if (n%i==0) {
        		 System.out.println("not a prime number");
 				flag=1;
 				break;
 			}
		}
         if (flag==0) {
				System.out.println(n+" is a prime number");
			}
		}
       			
		}
	}

