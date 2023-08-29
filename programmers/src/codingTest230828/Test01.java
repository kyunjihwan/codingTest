package codingTest230828;

public class Test01 {
	
	public static void main(String[] args) {
		int answer = 0;
		int[][] board = {{0,1,2},{1,2,3},{2,3,4},{3,4,5}};
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				if(i+j <= 2) {
					answer += board[i][j]; 
				}
			}
		}
		
		System.out.println(answer);
		
		
	}

}
