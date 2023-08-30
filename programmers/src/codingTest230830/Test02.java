package codingTest230830;

public class Test02 {

	public static void main(String[] args) {
		
		long answer = 0;
		
		int a = 3;
		int b = 5;
		long sum = 0;
		
		if(a <= b) {
			for(long i = a; i <= b; i++) {
				sum += i;
			}
		}else {
			for(long i = b; i <= a; i++) {
				sum += i;
			}
		}
		
		
		
		answer = sum;
		
		System.out.println(answer);
		
	}
	
}
