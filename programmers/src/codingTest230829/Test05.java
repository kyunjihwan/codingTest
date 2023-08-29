package codingTest230829;

import java.util.Arrays;

public class Test05 {

	public static void main(String[] args) {
		
		int x = 1;
		int n = 3;
		
		long[] answer = new long[n];
		
		// 오버 플로우 대비
		long num = x;
		for(int i = 0; i < answer.length; i++) {
			answer[i] = num*(i+1);
		}
		
		System.out.println(Arrays.toString(answer));
		
	}
	
}
