package codingTest230902;

import java.util.ArrayList;
import java.util.List;

public class Test04 {

	public static void main(String[] args) {
		
		int n = 3;
		int[] slicer = {1,5,2};
		int[] num_list = {1,2,3,4,5,6,7,8,9};
		
		List<Integer> list = new ArrayList<Integer>();
		
		switch (n) {
		case 1:{
			
			for(int i = 0; i <= slicer[1]; i++) {
				list.add(num_list[i]);
			}
			
			break;
		}
		case 2:{
			
			for(int i = slicer[0]; i < num_list.length; i++) {
				list.add(num_list[i]);
			}
			
			break;
		}
		case 3:{
			
			for(int i = slicer[0]; i <= slicer[1]; i++) {
				list.add(num_list[i]);
			}
			
			break;
		}
		case 4:{
			
			for(int i = slicer[0]; i <= slicer[1]; i = i+slicer[2]) {
				list.add(num_list[i]);
			}
			
			break;
		}
		
		}
		
		int[] answer = new int[list.size()];
		
		for(int i = 0 ; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		System.out.println(list.toString());
		
	} // main
	
} // class
