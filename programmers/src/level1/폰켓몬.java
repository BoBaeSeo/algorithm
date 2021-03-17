package level1;

import java.util.HashSet;

public class 폰켓몬 {

	public static int solution(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
        
		for(int i : nums) {
        	set.add(i);
        }

        if(set.size() > nums.length / 2 ) {
        	return nums.length / 2;
        } else {
        	return set.size();
        }
    }
	
	public static void main(String[] args) {
		int[] nums = {3, 1, 2, 3};
		int a = solution(nums);
		System.out.println("a: " + a);
	}
}
