package codingTest230901;

import java.util.Arrays;

public class Test08 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int num = 1;
		
		while(arr.length >= num) {
			num = num * 2;
		}
		
		int[] answer = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			answer[i] = arr[i];
		}
		
		for(int i = arr.length; i < answer.length; i++) {
			answer[i] = 0;
		}
		
		System.out.println(Arrays.toString(answer));
	}
	
}
