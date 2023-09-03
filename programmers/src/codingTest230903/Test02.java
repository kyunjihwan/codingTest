package codingTest230903;

import java.util.ArrayList;
import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		
		int n = 420;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 2; i <= n; i++) {
			if(n % i == 0) {
				while(n % i == 0) {
					n /= i;
				}
				list.add(i);
			}
		}
		int[] answer = new int[list.size()];
		
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		System.out.println(Arrays.toString(answer));
		
	}
	
}
