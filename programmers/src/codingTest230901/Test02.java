package codingTest230901;

public class Test02 {

	public static void main(String[] args) {
		String myString = "banana";
		String pat = "ana";
		
		int answer = 0;
		int patLength = pat.length();
		
		for(int i = 0; i <= myString.length()-pat.length(); i++) {
			if(myString.substring(i, patLength).contentEquals(pat)) {
				answer++;
			}
			patLength++;
			
		}
		
		
		
		
		System.out.println(answer);
	}
	
}
