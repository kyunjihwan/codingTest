package codingTest230831;

public class Test04 {

	public static void main(String[] args) {
		
		String myString = "AbCdEFG";
		
		String pat = "dE";
		
		int num = myString.lastIndexOf(pat);
		
		String answer = myString.substring(0, num+pat.length());
		
		System.out.println(answer);
		System.out.println(num);
		
	}
	
}
