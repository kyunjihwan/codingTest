package codingTest230903;

public class Test04 {

	public static void main(String[] args) {
		
		String code = "qjnwezgrpirldywt";
		int q = 3;
		int r = 1;
		char[] charArr = code.toCharArray();
		String answer = "";
		
		for(int i = r; i < charArr.length; i += q) {
			
			answer += String.valueOf(charArr[i]);
		}
		
		System.out.println(answer);
		
		
		
	}
	
}
