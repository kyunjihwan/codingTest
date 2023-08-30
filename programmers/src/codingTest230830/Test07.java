package codingTest230830;

public class Test07 {

	public static void main(String[] args) {
		
		
		String phone_number = "01033334444";
		String answer = "";
		
		String realNumber = phone_number.substring(phone_number.length()-4, phone_number.length());
		
		for(int i = 0 ; i < phone_number.length() - 4; i++) {
			answer += "*";
		}
		
		answer += realNumber;
		
		System.out.println(answer);
		
	}
	
}
