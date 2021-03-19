package level1;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class 문자열내림차순으로배치하기 {

	public static String solution(String s) {
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0; i < s.length(); i++) {
			list.add(s.substring(i, i+1));
		}
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.charAt(0) - o1.charAt(0);
			}
			
		});
		
		String answer = "";
		for(String a : list) {
			answer += a;
		}
        return answer;
    }
	
	public static String reverseStr(String s){
	    char[] sol = s.toCharArray();
	    Arrays.sort(sol);
	    return new StringBuilder(new String(sol)).reverse().toString();
	    }
	
	public static void main(String[] args) {
		String s = "Zbcdefg";
		solution(s);
		reverseStr(s);
	}
}

