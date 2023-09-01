package codingTest230901;

import java.util.ArrayList;
import java.util.List;

public class Test03 {

	public static void main(String[] args) {
		
		String myStr = "baconlettucetomato";
		
		String[] myStrArr = myStr.split("[a-c]");
		
		List<String> strList = new ArrayList<String>(); 
		
		for(int i = 0; i < myStrArr.length; i++) {
			if(!myStrArr[i].equals("")) {
				strList.add(myStrArr[i]);
			}
		}
		
		if(strList.size() == 0) {
			String[] empty = {"EMPTY"};
		}
		
		String[] answer = new String[strList.size()];
		
		
		for(int i = 0; i < strList.size(); i++) {
			answer[i] = strList.get(i);
		}
		
	}
	
}
