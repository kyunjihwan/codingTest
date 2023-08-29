package codingTest230828;

import java.util.stream.Stream;

public class Test08 {

	public static void main(String[] args) {
		int n = 123;
		int answer = 0;
		int[] digits = Stream.of(String.valueOf(n).split(""))
			       .mapToInt(Integer::parseInt)
		               .toArray();
		
		for(int i = 0; i < digits.length; i++) {
			answer += digits[i];
		}
		
	}
}
