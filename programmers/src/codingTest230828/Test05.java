package codingTest230828;

import java.util.ArrayList;
import java.util.List;

public class Test05 {

	public static void main(String[] args) {
		int[] arr = {3,2,4,1,3};
		boolean[] flag = {true, false, true, false, false};
		
		List<Integer> arrList = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			if(flag[i]) {
				for(int j = 0; j < arr[i]*2; j++) {
					arrList.add(arr[i]);
				}
				continue;
			}
			
			for(int j = 0; j < arr[i]; j++) {
				arrList.remove(arrList.size() - 1);
			}
		}
		int[] answer = new int[arrList.size()];
		for(int i = 0; i < arrList.size(); i++) {
			answer[i] = arrList.get(i).intValue();
		}
		
	}
	
}
