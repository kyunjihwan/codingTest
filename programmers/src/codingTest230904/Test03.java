package codingTest230904;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		
		String my_string = "100 + 20 - 10";
		int sum = 0;
		
		String[] myStringArr = my_string.split(" ");
		sum += Integer.parseInt(myStringArr[0]);
		for(int i = 1; i < myStringArr.length;i += 2) {
			if(myStringArr[i].equals("+")) {
				sum += Integer.parseInt(myStringArr[i+1]);
			}else {
				sum -= Integer.parseInt(myStringArr[i+1]);
			}
		}
		
		
		
		
//		if(my_string.contains("+")) {
//			String[] strArr = my_string.split(" \\+ ");
//			for(int i = 0; i < strArr.length; i++) {
//				sum += Integer.parseInt(strArr[i]);
//			}
//		}else {
//			String[] strArr = my_string.split(" \\- ");
//			sum += Integer.parseInt(strArr[0]);
//			for(int i = 1; i < strArr.length; i++) {
//				sum -= Integer.parseInt(strArr[i]);
//			}
//		}
		
		System.out.println(sum);
		
	}
	
}
