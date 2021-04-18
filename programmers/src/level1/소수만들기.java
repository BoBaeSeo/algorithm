package level1;

import java.util.ArrayList;

public class 소수만들기 {

    public int solution(int[] nums) {
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++) {
        	if(i + 2 >= nums.length) break;
        	for(int j = i + 1; j < nums.length; j++) {
        		for(int h = j + 1; h < nums.length; h++) {
        			list.add(nums[i] + nums[j] + nums[h]);
        		}
        	}
        }
        
        
        
        for(Integer i : list) {
        	int count = 2;
        	answer++;
        	while(count < i) {
        		if(i % count == 0) {
        			answer--;
        			break;
        		}
        		count++;
        	}
        	System.out.println("i: " + i);
        	System.out.println(answer);
        }
        return answer;
    }
}
