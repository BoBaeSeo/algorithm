package level1;

import java.util.ArrayList;

public class 같은숫자는싫어 {

	public static int[] solution(int []arr) {
        
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0; i < arr.length; i++) {
        	if(i == 0) {
        		a.add(arr[i]);
        		continue;
        	}
        	if(arr[i-1] != arr[i]) {
        		a.add(arr[i]);
        	}
        }
        
        int[] answer = new int[a.size()];
        for(int i = 0; i < a.size(); i++) {
        	answer[i] = a.get(i); 
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		int[] a = solution(arr);
		for(int i: a) {
			System.out.println(i);
		}
	}
}
