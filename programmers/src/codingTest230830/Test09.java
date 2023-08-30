package codingTest230830;

public class Test09 {

	public static void main(String[] args) {
		
		String my_string = "Progra21Sremm3";
		int s = 6;
		int e = 12;
		
		char[] charArr = my_string.toCharArray();
		char[] beforeArr = new char[e-s+1];
		char[] changeArr = new char[e-s+1];
		
		int a = 0;
		for(int i = s; i <= e; i++) {
			beforeArr[a] = charArr[i];
			a++;
		}
		
		for (int i = beforeArr.length; i > 0; i--) {
	        changeArr[beforeArr.length - i] = beforeArr[i - 1];
	    }
		
		a = 0;
		for(int i = s; i <= e; i++) {
			charArr[i] = changeArr[a]; 
			a++;
		}
		
		String answer = new String(charArr);
		
		System.out.println(answer);
		
	}
	
}
