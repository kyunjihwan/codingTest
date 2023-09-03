package codingTest230903;

import java.util.ArrayList;
import java.util.List;

public class Test07 {

	public static void main(String[] args) {
		
		String my_str = "abc1Addfggg4556b";
		int n = 6;
		int frist = 0;
		int last = n;
		boolean check = true;
		
		List<String> list = new ArrayList<String>();
		
		while(check) {
			if(my_str.length() == frist) {
				break;
			}
			if(my_str.length() < last) {
				list.add(my_str.substring(frist, my_str.length()));
				break;
			}
			
			list.add(my_str.substring(frist, last));
			frist = frist + n;
			last = last + n;
		}
		
		String[] answer = new String[list.size()];
		
		for(int i = 0; i< list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		System.out.println(list);
		
	}
	
}
