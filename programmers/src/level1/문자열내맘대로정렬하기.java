package level1;

import java.util.ArrayList;
import java.util.Collections;

public class 문자열내맘대로정렬하기 {

	public String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];
        ArrayList<String> list = new ArrayList<String>();
        
        for(String str : strings) {
        	list.add(str.charAt(n) + str);
        }
        
        Collections.sort(list);
        
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = list.get(i).substring(1);
        }
        
        return answer;
    }
}
