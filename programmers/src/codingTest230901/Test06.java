package codingTest230901;

public class Test06 {

	public static void main(String[] args) {
		
		String s = "qwer";
		
		String answer = "";
		
		if(s.length() % 2 == 1) {
			answer = s.substring(s.length()/2, s.length()/2+1);
		}else {
			answer = s.substring(s.length()/2-1, s.length()/2+1);
		}
		
		System.out.println(answer);
		
		
	}
	
}
