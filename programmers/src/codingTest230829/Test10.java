package codingTest230829;

public class Test10 {

	public static void main(String[] args) {
		long n = 4;
		long answer = -1;
		
		for(int i = 1; i <= n; i++) {
			if(n%i == 0) {
				if((n/i) == i) {
					long a = i;
					answer = (a+1)*(a+1);
					break;
				}
			}
		}
		
		System.out.println(answer);
	}
	
}
