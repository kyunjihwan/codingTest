package codingTest230914;

public class Test02 {

	public static void main(String[] args) {
		
		String new_id = "z-+.^.";
		
		// 1단계
		String str = new_id.toLowerCase();
		
		System.out.println(str);
		
		// 2단계
		char[] charArr = str.toCharArray();
		
		for(int i = 0; i < charArr.length; i++) {
			if(charArr[i] == '!' || charArr[i] == '@' || charArr[i] == '#' || charArr[i] == '*'|| charArr[i] == '^'|| charArr[i] == '+'|| charArr[i] == '=') {
				charArr[i] = ' ';
			}
		}
		
		String str2 = new String(charArr);
		
		str2 = str2.replace(" ", "");
		System.out.println(str2);
		
		// 3단계
		char[] charArr2 = str2.toCharArray();
		
		for(int i = 0; i < charArr2.length-1; i++) {
			if(charArr2[i] == '.') {
				if(charArr2[i] == charArr2[i+1]) {
					charArr2[i] = ' ';
				}
			}
		}
		
		String str3 = new String(charArr2);
		str3 = str3.replace(" ", "");
		System.out.println(str3);
		System.out.println(str3.length());
		
		// 4단계
		if(str3.charAt(0) == '.') {
			str3 = str3.substring(1, str3.length());
		}else if (str3.charAt(str3.length()-1) == '.') {
			str3 = str3.substring(0, str3.length()-1);
		}
		
		System.out.println(str3);
		
		// 6단계
		if(str3.length() > 15) {
			str3 = str3.substring(0, 15);
		}
		
		System.out.println(str3);
		
		// 7단계
		while(str3.length() <= 2) {
			str3 += str3.charAt(str3.length());
		}
		
		System.out.println(str3);
		
		
		
		
		
		
	}
	
}
