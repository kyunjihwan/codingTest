package codingTest230902;

import java.util.Arrays;

public class Test05 {

	public static void main(String[] args) {
		
		String bin1 = "10";
		String bin2 = "11";
		
		String answer = "";
		
		// Integer.parseInt(변수, 2) 이진수 계산
		int num1 = Integer.parseInt(bin1,2);
		int num2 = Integer.parseInt(bin2,2);
		
		System.out.println(num1);
		
		int sum = num1 + num2;
		
		// 자바 메소드 활용
		answer = Integer.toBinaryString(sum);
		System.out.println(answer);
		
	}
	
}
