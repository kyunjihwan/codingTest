package codingTest230829;

public class Test02 {

	public static void main(String[] args) {
		
		int n = 12;
		int answer = 0;
		
		for(int i = 2; i <= n; i++) {
			if(n%i == 1) {
				answer = i;
				break;
			}
		}
		
		System.out.println(answer);
		
	}
	
}
