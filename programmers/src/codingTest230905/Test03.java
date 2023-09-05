package codingTest230905;

import java.util.ArrayList;
import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		
		int[] arr = {0, 1, 1, 0};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			if(list.size() == 0) {
				list.add(arr[i]);
			}else if(list.get(list.size()-1) == arr[i]) {
				list.remove(list.size()-1);
			}else if(list.get(list.size()-1) != arr[i]) {
				list.add(arr[i]);
			}
		}
		
		int[] answer = new int[list.size()];
		
		if(list.size() == 0) {
			int[] nullArr = {-1};
		}else {
			for(int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			}
		}
		
		System.out.println(Arrays.toString(answer));
	}
	
}
