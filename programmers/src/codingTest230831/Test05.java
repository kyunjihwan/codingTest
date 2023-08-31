package codingTest230831;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test05 {
	
	public static void main(String[] args) {
		
		int[] arr = {4,3,2,1};
		int minLocaiton = 0;
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
				minLocaiton = i;
			}
		}
		
		if((arr.length - 1) == 0) {
			
		}
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			if(i == minLocaiton) {continue;}
			list.add(arr[i]);
		}
		
		int[] answer = new int[list.size()];
		
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		System.out.println(Arrays.toString(answer));
		
		
		
	}

}
