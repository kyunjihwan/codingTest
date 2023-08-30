package codingTest230830;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test05 {

	public static void main(String[] args) {
		int[] arr = {2,36,1,3};
		int divisor = 1;
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
		Collections.sort(list);
		int[] answer;
		if(list.size() > 0) {
			answer = new int[list.size()];
			for(int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			}
			
		}else {
			answer = new int[1];
			answer[0] = -1;
		}
		
		
		System.out.println(Arrays.toString(answer));
		
		
	}
	
}
