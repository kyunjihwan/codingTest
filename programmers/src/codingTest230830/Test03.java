package codingTest230830;

public class Test03 {

	public static void main(String[] args) {
		
		int num = 16;
		
		int answer = 0;
		int count = 0;
		
		while(!(num == 1)) {
			if(count == 500) {
				count = -1;
				break;
			}
			if(num % 2 == 0) {
				num = num/2;
			}else if(num % 2 == 1) {
				num = (num * 3) + 1; 
			}
			count++;
		}
		
		answer = count;
		
		System.out.println(answer);
		
	}
	
}
