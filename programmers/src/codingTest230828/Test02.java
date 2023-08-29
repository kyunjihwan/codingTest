package codingTest230828;

public class Test02 {

	public static void main(String[] args) {
		
		int[] arr = {0,1,2,3,4};
		int[] answer = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			answer[i] = arr[i];
		}
		
		int[][] queries = {{0,1},{1,2},{2,3}};
		for(int k = 0; k < arr.length; k++) {
			for(int i = 0; i < queries.length; i++) {
				if(queries[i][0] <= k && k <= queries[i][1]) {
					answer[k]++;
				}
			}
			
		}
		
		for(int k = 0; k < answer.length; k++) {
			
			System.out.println(answer[k]);
		}
		
		
		
	}
	
}
