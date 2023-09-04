package codingTest230904;

import java.math.BigInteger;

public class Test05 {

	public static void main(String[] args) {
		
		String a = "18446744073709551615";
		String b = "287346502836570928366";
		
		String answer = "";
		BigInteger numA = new BigInteger(a);
		BigInteger numB = new BigInteger(b);
		
		BigInteger sum = numA.add(numB);
		
		System.out.println(sum.toString());
		
	}
	
}
