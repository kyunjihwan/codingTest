package codingTest230915;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Test01 {

	public static void main(String[] args) {
		
		int[] arr = {0, 1, 1, 2, 2, 3};
		int k = 3;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			if(list.size() == k) {
				break;
			}
			if(!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}
		
		while(list.size() < k) {
			list.add(-1);
		}
		
		int[] answer = new int[list.size()];
		
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		System.out.println(list);
		
		
	}
	
}
