package codingTest230902;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		
		int[] arr = {0,1,2,4,3};
		int[][] queries = {{0,4,1},{0,3,2},{0,3,3}};
		
		int[] answer = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			answer[i] = arr[i];
		}
		
		for(int i = 0; i < queries.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(queries[i][0] <= j && j <= queries[i][1] && j % queries[i][2] == 0) {
					answer[j]++;
				}
			}
		}
		
		System.out.println(Arrays.toString(answer));
		
	}
	
}
