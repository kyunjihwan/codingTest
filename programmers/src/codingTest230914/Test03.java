package codingTest230914;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class Test03 {

	public static void main(String[] args) {
		
		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i < name.length; i++) {
			map.put(name[i], yearning[i]);
		}
		
		int[] answer = new int[photo.length];
		
		for(int i = 0; i < photo.length; i++) {
			for(int j = 0; j < photo[i].length; j++) {
				for(Entry<String, Integer> elem : map.entrySet()){
					
					if(photo[i][j].equals(elem.getKey())) {
						answer[i] += elem.getValue();
					}
	            }
			}
		}
		
		System.out.println(Arrays.toString(answer));
		
	}
	
}
