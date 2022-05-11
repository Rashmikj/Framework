package CompletePrograms;

public class ArraySmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {21,32,12,76,01,23};
		int max=a[0];;
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
