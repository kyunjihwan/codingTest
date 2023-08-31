package codingTest230831;

public class Test03 {

	public static void main(String[] args) {
		
		boolean x1 = false;
		boolean x2 = true;
		boolean x3 = true;
		boolean x4 = true;
		
		boolean answer = true;
		
		if((x1 || x2) && (x3 || x4)) {
			answer = true;
		}else {
			answer = false;
		}
		
		System.out.println(answer);
	}
	
}
