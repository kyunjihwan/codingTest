package codingTest230831;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		
		String my_string = "aAb1B2cC34oOp";
		int answer = 0;
		
		String[] ms = my_string.split("[a-zA-Z]");
		for(int i = 0; i < ms.length; i++) {
			if(!ms[i].isEmpty()) {
				answer += Integer.parseInt(ms[i]);
			}
		}
		
		System.out.println(answer);
		
	}
	
}
