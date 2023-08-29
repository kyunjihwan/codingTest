package codingTest230829;

import java.util.Arrays;

public class Test08 {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4};
		int[][] queries = {{0,3},{1,2},{1,4}};
		
		int[] location = new int[2];
		int[] value = new int[2];
		
		for(int i = 0; i < queries.length; i++) {
			for(int j = 0; j < queries[i].length; j++) {
				location[j] = queries[i][j];
				value[j] = arr[queries[i][j]];
			}
			arr[location[0]] = value[1];
			arr[location[1]] = value[0];
		}
		
		System.out.println(Arrays.toString(arr));
		
	} // main
	
} // class
