package codingTest230828;

public class Test06 {

	public static void main(String[] args) {
		
		String my_string = "apporoograpemmemprs";
		int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};
		
		char[] arr = my_string.toCharArray();
		
		for(int i = 0; i < indices.length; i++) {
			arr[indices[i]] = ' ';
		}
		
		String str = new String(arr);
		String answer = str.replaceAll(" ", "");
		System.out.println(answer);
		
	}
	
}
