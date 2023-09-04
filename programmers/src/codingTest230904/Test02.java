package codingTest230904;

import java.util.ArrayList;

public class Test02 {

	public static void main(String[] args) {
		
		int[] arr = {1,4,2,5,3};
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int i =0;
		
		while(i < arr.length) {
			if(list.size() == 0) {
				list.add(arr[i]);
				i++;
			}else if(list.size() != 0 && list.get(list.size() - 1) < arr[i]) {
				list.add(arr[i]);
				i++;
			}else if(list.size() != 0 && list.get(list.size() - 1) >= arr[i]) {
				list.remove(list.size()-1);
			}
		}
		
		int[] stk = new int[list.size()];
		for(int j = 0; j < list.size(); j++) {
			stk[j] = list.get(j);
		}
		
		System.out.println(list);
		
		
	}
	
}
