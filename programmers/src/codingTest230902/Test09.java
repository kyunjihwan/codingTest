package codingTest230902;

public class Test09 {

	public static void main(String[] args) {
		
		int[] array = {7, 77, 17};
		int answer = 0;
		
		for(int i = 0; i < array.length; i++) {
			String str = String.valueOf(array[i]);
			String[] strArr = str.split("");
			
			for(int j = 0; j < strArr.length; j++) {
				if(strArr[j].equals("7")) {
					answer++;
				}
			}
		}
		
		System.out.println(answer);
		
	}
	
}
