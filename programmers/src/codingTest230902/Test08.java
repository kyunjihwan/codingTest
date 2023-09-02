package codingTest230902;

import java.util.HashMap;
import java.util.Map;

public class Test08 {

	public static void main(String[] args) {
		
		int left = 13;
		int right = 17;
		int answer = 0;
		
		Map<Integer, Integer> divisorMap = new HashMap<Integer, Integer>();
		
		for(int i = left; i <= right; i++) {
			int count = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			divisorMap.put(i, count);
		}
		
		System.out.println(divisorMap.toString());
		
		for(int i = left; i <= right; i++) {
			if(divisorMap.get(i) % 2 == 0) {
				answer += i;
			}else {
				answer -= i;
			}
		}
		
		System.out.println(answer);
		
	}
	
}
