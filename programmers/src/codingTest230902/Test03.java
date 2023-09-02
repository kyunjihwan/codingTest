package codingTest230902;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		int[] arr = {1,2,1,4,5,2,9};
		
		String str = Arrays.toString(arr).replaceAll("[^0-9 ]","");
		
		int frist = str.indexOf("2");
		int last = str.lastIndexOf("2");
		
		
		if(frist == -1) {
			int[] emptyValue = {-1};
		}else if(frist == last) {
			int[] sameValue = {2};
		}
		str = str.substring(frist,last+1);
		String[] strArr = str.split(" ");
		
		int[] answer = new int[strArr.length];
		for(int i = 0; i < strArr.length; i++) {
			
			answer[i] = Integer.parseInt(strArr[i]);
		}
		
		System.out.println(Arrays.toString(answer));
		
	}
	
}
