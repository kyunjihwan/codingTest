package codingTest230902;

public class Test06 {

	public static void main(String[] args) {
		
		String s = "1 2 Z 3";
		
		int answer = 0;
		String[] str = s.split(" ");
		
		for(int i = 0; i < str.length; i++) {
			if(str[i].equals("Z")) {
				answer -= Integer.parseInt(str[i-1]);
				continue;
			}
			answer += Integer.parseInt(str[i]);
			
		}
		
		System.out.println(answer);
		
	}
	
}
