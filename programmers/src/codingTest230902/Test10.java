package codingTest230902;

import java.util.Arrays;

public class Test10 {

	public static void main(String[] args) {
		
		String s = "Zbcdefg";
		
		char[] charArr = s.toCharArray();
		
		Arrays.sort(charArr);
		String str = new String(charArr); 
		
		StringBuffer sb = new StringBuffer(str);
		String reverse = sb.reverse().toString();
		
		System.out.println(reverse);
		
	}
	
}
