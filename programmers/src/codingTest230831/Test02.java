package codingTest230831;

import java.util.Arrays;

public class Test02 {
	
	public static void main(String[] args) {
		int[] array = {10,11,12};
		int n = 13;
		
		Arrays.sort(array);
		
		int answer = 0;
		int min = 100;
		
		for(int i = 0; i < array.length; i++) {
			if(Math.abs(array[i] - n) < min ){
				min = Math.abs(array[i] - n);
				answer = array[i];
			}
		}
		
		
		System.out.println(answer);
	}

}
