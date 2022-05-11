package StaticNonstatic;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="rashmi";
		System.out.println(a.charAt(0));
		System.out.println(a.indexOf("s"));
		System.out.println(a.substring(0, 2));
		System.out.println(a.substring(0));
		System.out.println(a.concat(" i love you"));
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		String[] arr = a.split("s");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replaceAll("rashmi", "charan"));

		
	}

}
