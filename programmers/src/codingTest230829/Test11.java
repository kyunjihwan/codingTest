package codingTest230829;

import java.util.Arrays;

public class Test11 {

	public static void main(String[] args) {
		long n = 118372;
		
		long answer = 0;
		
		String str = String.valueOf(n);
		
		char[] charArr = str.toCharArray();
		Arrays.sort(charArr);
		char[] charArr1 = new char[charArr.length];
		
		for(int i = 0; i < charArr.length; i++) {
			charArr1[i] = charArr[charArr.length-i-1];
		}
		
		String str1 = new String(charArr1);
		answer = Long.parseLong(str1);
		
		System.out.println(answer);
		
		
		
	}
	
}
