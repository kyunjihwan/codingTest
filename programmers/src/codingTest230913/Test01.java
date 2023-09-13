package codingTest230913;

import java.util.Arrays;

public class Test01 {
	
	public static void main(String[] args) {
		String my_string = "rermgorpsam";
		int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
		char[] charArr = my_string.toCharArray();
		
		for(int i = 0; i < queries.length; i++) {
				
			int a = 0;
			String str = my_string.substring(queries[i][0], queries[i][1]+1);
			for(int j = queries[i][0]; j <= queries[i][1]; j++) {
				charArr[j] = str.charAt(queries[i][1] - queries[i][0] - a);
				a++;
			}
			
			my_string = new String(charArr);
			
			
		}
		
	}

}
