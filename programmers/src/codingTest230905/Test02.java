package codingTest230905;

import java.util.ArrayList;
import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		String[] str_list = {"r"};
		
		
		int indexL = -1;
		int indexR = -1;
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0; i < str_list.length; i++) {
			if(str_list[i].equals("l")) {
				indexL = i;
				break;
			}else if(str_list[i].equals("r")) {
				indexR = i;
				break;
			}
		}
		
		
		if(indexL == -1 && indexR == -1) {
			String[] nullArr = new String[0];
		}
		
		
		if(indexR == -1 && indexL != -1) {
			for(int i = 0; i < indexL; i++) {
				list.add(str_list[i]);
			}
		}else if(indexL == -1 && indexR != -1){
			for(int i = indexR + 1; i < str_list.length; i++) {
				list.add(str_list[i]);
			}
		}
		
		String[] answer = new String[list.size()];
		
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		System.out.println(Arrays.toString(answer));
		
		
	}
	
}
