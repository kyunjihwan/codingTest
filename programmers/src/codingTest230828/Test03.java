package codingTest230828;

public class Test03 {
	public static void main(String[] args) {
		
		String answer = "ihrhbakrfpndopljhygc";
		
		int m = 4;
		
		String a = "";
		
		for(int i = 1; i < answer.length(); i+= m) {
			 a += String.valueOf(answer.charAt(i));
		}
		
		System.out.println(a);
		
	}
}
