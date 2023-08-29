package codingTest230828;

public class Test07 {

	public static void main(String[] args) {
		
		int answer = 0;
		
		int i = 1;
		int j = 13;
		int k = 1;
		
		
		
		for(int a = i; a <= j; a++) {
			String str1 = Integer.toString(a);
			String value = Integer.toString(k);
			
			if(str1.contains(value)) {
				for (int b = 0; b < str1.length(); b++) {
					if(str1.charAt(b) == value.charAt(0)) {
						answer++;
			        }
			    }
			}
		}
		
		
	}
	
}
