package codingTest230905;

public class Test01 {

	public static void main(String[] args) {
		
		int[] sides = {3, 6};
		int max = sides[0];
		int num = 0;
		int count = 0;
		
		int answer = 0;
		
		for(int i = 0; i < sides.length; i++) {
			if(sides[i] > max) {
				max = sides[i];
			}else {
				num = sides[i];
			}
		}
		
		for(int i = 1; i <= max; i++) {
			if(max - num < i) {
				System.out.println(i);
				count++;
			}
		}
		
		for(int i = 1; i < max+num; i++) {
			if(i > max) {
				System.out.println(i);
				count++;
			}
		}
		
		System.out.println(count);
		
	}
	
}
