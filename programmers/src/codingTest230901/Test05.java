package codingTest230901;

import java.util.Arrays;

public class Test05 {

	public static void main(String[] args) {
		String s = "abcabcadc";
		
		char[] charArr = s.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		for(char c : charArr) {
			if(s.indexOf(String.valueOf(c)) == s.lastIndexOf(String.valueOf(c))){
				sb.append(c);
			}
		}
		
		char[] answerArr = sb.toString().toCharArray();
		
		Arrays.sort(answerArr);
		
		String answer = new String(answerArr);
		
		System.out.println(answer);
		
		
		
		
	}
	
}
