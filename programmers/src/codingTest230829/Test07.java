package codingTest230829;

import java.util.Arrays;

public class Test07 {

	public static void main(String[] args) {
	
		String s = "pPoooyY";
		
		String str = s.toLowerCase();
		
		boolean answer = true;
		
		char[] chs = str.toCharArray();
		
		int p = 0;
		int y = 0;
		
		for(int i = 0; i < chs.length; i ++) {
			
			if(chs[i] == 'p') {
				p++;
			}else if(chs[i] == 'y') {
				y++;
			}
			
		}
		
		if(p == y) {
			answer = true;
		}else {
			answer = false;
		}
		
		
		System.out.println(Arrays.toString(chs));
		System.out.println(answer);
	} // main
	
} // class
