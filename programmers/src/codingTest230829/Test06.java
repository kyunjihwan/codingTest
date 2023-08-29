package codingTest230829;

public class Test06 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		double answer = 0;
		
		for(int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		
		answer = answer/arr.length;
		
		System.out.println(answer);
		
	}
	
}
