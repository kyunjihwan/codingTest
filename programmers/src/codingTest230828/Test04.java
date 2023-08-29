package codingTest230828;

import java.util.Arrays;

public class Test04 {
	
	public static void main(String[] args) {
		int answer = 0;
		String before = "hello";
		String after = "olleh";
		
		char[] charArr1 = before.toCharArray();
		Arrays.sort(charArr1);
		String result1 = new String(charArr1);
		
		char[] charArr2 = after.toCharArray();
		Arrays.sort(charArr2);
		String result2 = new String(charArr2);
		
		if(result1.equals(result2)) {
			answer = 1;
		}else {
			answer = 0;
		}
		
		System.out.println(answer);
		
	} // main
	
} // class
