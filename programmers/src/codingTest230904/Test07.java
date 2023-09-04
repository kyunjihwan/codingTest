package codingTest230904;

public class Test07 {

	public static void main(String[] args) {
		
		String s = "-1 -2 3 -4";
		String answer = "";
		String[] strArr = s.split(" ");
		String min = strArr[0];
		String max = strArr[0];
		
		for(int i = 0; i < strArr.length; i++) {
			if(Integer.parseInt(min) > Integer.parseInt(strArr[i]) ) {
				min = strArr[i];
			}
			if(Integer.parseInt(max) < Integer.parseInt(strArr[i]) ) {
				max = strArr[i];
			}
		}
		
		answer = min + " " + max;
		
		System.out.println(min);
		System.out.println(max);
		
		
		
	}
	
}
