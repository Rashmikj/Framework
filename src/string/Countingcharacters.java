package string;

public class Countingcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s="gfgydegvikjfenvbnmfe579832";
 int count=0;
 for (int i = 0; i <s.length(); i++) {
	if (s.charAt(i)!=' ') {
		count++;
	}
	
}
 System.out.println(count);
	}

}
