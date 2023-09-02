package codingTest230902;

public class Test01 {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i]*b[i];
		}
		
		System.out.println(sum);
		
	}
	
}
