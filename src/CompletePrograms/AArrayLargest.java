package CompletePrograms;

public class AArrayLargest {

	public static void main(String[] args) {
  int s[]= {2,23,21,4,22,1,6};
		int min=s[0];
		for (int i = 0; i < s.length; i++) {
			if (s[i]>min) {
				min=s[i];
			}
		}
		System.out.println(min);
	}

}
