package codingTest230903;

public class Test03 {

	public static void main(String[] args) {
		
		String[] order = {"americanoice", "americano", "iceamericano"};
		int answer = 0;
		
		for(int i = 0; i < order.length; i++) {
			if(order[i].contains("americano")) {
				answer += 4500;
			}else if(order[i].contains("cafelatte")) {
				answer += 5000;
			}else {
				answer += 4500;
			}
		}
		
		System.out.println(answer);
		
	}
	
}
