package codingTest230903;

public class Test06 {

	public static void main(String[] args) {
		
		int price = 3;
		int money = 20;
		int count = 4;
		long sum = 0;
		
		for(int i = 1; i <= count; i++) {
			sum += price * i;
		}
		long answer = 0;
		if(sum > money) {
			answer = sum - money;
		}else {
			answer = 0;
		}
		
		System.out.println(answer);
		
	}
	
}
