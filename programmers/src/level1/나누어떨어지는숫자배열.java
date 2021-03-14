package level1;

import java.util.ArrayList;
import java.util.Collections;

public class 나누어떨어지는숫자배열 {

	public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] % divisor == 0) {
        		temp.add(arr[i]);
        	}
        }
        int[] answer = new int[temp.size()];
        if(temp.size() == 0) {
        	answer = new int[1];
        	answer[0] = -1;
        } else {
        	Collections.sort(temp);
        	for(int i = 0; i < temp.size(); i++) {
        		answer[i] = temp.get(i);
        	}
        }
        return answer;
    }
}
