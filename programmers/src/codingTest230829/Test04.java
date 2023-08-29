package codingTest230829;

import java.util.stream.Stream;

public class Test04 {

	public static void main(String[] args) {
	
		int num = 12345;
		int[] digits = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
		int[] answer = new int[digits.length];
		
		for(int i = 0; i < digits.length; i++) {
			answer[i] = digits[digits.length-1-i];
		}
		
	}
	
}
