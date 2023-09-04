package codingTest230904;

public class Test04 {

	public static void main(String[] args) {
		
		String s = "a234";
		boolean answer = true;
		if(!(s.length() == 4 || s.length() == 6)) {
			answer = false;
//            return answer;
		}
		
		String str = s.toLowerCase();
		
		String[] strArr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
		
		for(int i = 0; i < strArr.length; i++) {
			if(str.contains(strArr[i])) {
				answer = false;
				break;
			}
		}
		
		System.out.println(answer);
		
	}
	
}
