package codingTest230914;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Test01 {

	public static void main(String[] args) {
		
		int[] number = {5,0,2,7};
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < number.length; i++) {
			for(int j = i+1; j < number.length; j++) {
				set.add(number[i] + number[j]);
			}
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		
		Collections.sort(list);
		
		int[] answer = new int[list.size()];
		
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		
		
		
		
	}
	
}
