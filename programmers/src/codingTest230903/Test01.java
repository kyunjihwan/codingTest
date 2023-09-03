package codingTest230903;

public class Test01 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,100,99,98};
		int[] arr1 = new int[arr.length];
		int count = 0;
		boolean cycle = true;
		
		while(cycle) {
			for(int i = 0; i < arr.length; i++) {
				
				arr1[i] = arr[i];
				
				if(arr[i] >= 50 && arr[i] % 2 == 0) {
					arr[i] = arr[i] / 2;
				}else if(arr[i] < 50 && arr[i] % 2 == 1) {
					arr[i] = (arr[i] * 2) + 1;
				}
			}
			
			for(int i = 0; i < arr.length; i++) {
				if(arr1[i] == arr[i]) {
					cycle = false;
				}else {
					cycle = true;
					break;
				}
			}
			
			count++;
			
		}
		
		int answer = --count;
		
		System.out.println(answer);
		
	}
	
}
