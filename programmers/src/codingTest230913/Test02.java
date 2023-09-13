package codingTest230913;

import java.util.ArrayList;
import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		
		int[] arr = {0, 1, 2, 4, 3};
		int[][] queries = {{0,4,2},{0,3,2},{0,2,2}};
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < queries.length; i++) {
			int min = 10000001;
			for(int j = 0; j < arr.length; j++) {
				if(queries[i][0] <= j && j <= queries[i][1] && queries[i][2] < arr[j]) {
					if(arr[j] < min) {
						min = arr[j];
					}
				}
			}
			
			list.add(min);
			
		}
		
		int[] answer = new int[list.size()];
		
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
			if(list.get(i) == 10000001) {
				answer[i] = -1;
			}
		}
		
		System.out.println(Arrays.toString(answer));
		
		
	}
	
}
