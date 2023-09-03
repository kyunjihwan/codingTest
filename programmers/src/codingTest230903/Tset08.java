package codingTest230903;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Tset08 {

	public static void main(String[] args) {
		
		String my_string = "Programmers";
		
		int[] answer = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		char[] charArr = my_string.toCharArray();
		
		Map<Character, Integer> groupCount = new HashMap<Character, Integer>();
		
		
		for(int i = 0; i < charArr.length; i++) {
			groupCount.put(charArr[i], groupCount.getOrDefault(charArr[i], 0)+1);
		}
		
		for(Entry<Character, Integer> elem : groupCount.entrySet()){
			if(elem.getKey() >= 97) {
				answer[elem.getKey() - 71] = elem.getValue();
			}else {
				answer[elem.getKey() - 65] = elem.getValue();
			}
			
        }
		
		System.out.println(Arrays.toString(answer));
		
	}
	
}
