package codingTest230830;

public class Test08 {

	public static void main(String[] args) {
		
		int[] numbers = {1,2,3,4,6,7,8,0};
		int answer = -1;
		int sum = 45;
		int arrSum = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			arrSum += numbers[i];
			
		}
		
		sum -= arrSum;
		
		System.out.println(sum);
		
		
	}
	
}
