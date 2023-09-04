package codingTest230904;

import java.util.HashMap;
import java.util.Map.Entry;

public class Test01 {

	public static void main(String[] args) {
		
		long answer = 0;
		
		String numbers = "onetwothreefourfivesixseveneightnine";
		HashMap<String,String> numberMap = new HashMap<String,String>();
		numberMap.put("zero", "0");
		numberMap.put("one", "1");
		numberMap.put("two", "2");
		numberMap.put("three", "3");
		numberMap.put("four", "4");
		numberMap.put("five", "5");
		numberMap.put("six", "6");
		numberMap.put("seven", "7");
		numberMap.put("eight", "8");
		numberMap.put("nine", "9");
		
		for(Entry<String, String> elem : numberMap.entrySet()) {
			numbers = numbers.replaceAll(elem.getKey(), elem.getValue());
		}
		
		answer = Long.parseLong(numbers);
		
		System.out.println(numbers);
		
	}
	
}
