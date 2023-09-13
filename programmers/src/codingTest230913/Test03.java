package codingTest230913;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		
//		int[][] arr = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
//		int[][] arr = {{57, 192, 534, 2}, {9, 345, 192, 999}};
		int[][] arr = {{1, 2}, {3, 4}};
		int[][] answer = {};
		
		if(arr.length > arr[0].length) {
			answer = new int[arr.length][arr.length];
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					answer[i][j] = arr[i][j];
				}
				for(int j = arr[i].length; j < arr.length; j++) {
					answer[i][j] = 0;
				}
			}
		}else if(arr.length < arr[0].length) {
			answer = new int[arr[0].length][arr[0].length];
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					answer[i][j] = arr[i][j];
				}
			}
			for(int i = arr.length; i < arr[0].length; i++) {
				for(int j = 0; j < arr[0].length; j++) {
					answer[i][j] = 0;
				}
			}
		}else {
			answer = new int[arr.length][arr[0].length];
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					answer[i][j] = arr[i][j];
				}
			}
		}
		
		System.out.println(Arrays.toString(answer[3]));
		
		
		
	}
	
}
