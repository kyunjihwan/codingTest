package codingTest230830;

import java.util.stream.Stream;

public class Test01 {

	public static void main(String[] args) {
		
		boolean answer = true;
		int x = 11;
		int sum = 0;
		String str = String.valueOf(x);
		
		int[] numArr = Stream.of(str.split("")).mapToInt(Integer::parseInt).toArray();
		
		for(int i = 0; i < numArr.length; i++) {
			sum  += numArr[i];
		}
		
		if(x % sum == 0) {
			answer = true;
		}else {
			answer = false;
		}
		
		System.out.println(answer);
		
	}
	
}
