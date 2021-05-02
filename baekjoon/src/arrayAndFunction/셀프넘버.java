package arrayAndFunction;

import java.util.Arrays;

public class 셀프넘버 {

	public static void main(String[] args) {
		String answer = "";
		boolean[] arr = new boolean[10000];
		Arrays.fill(arr, true);
		int start = 1;
		
		while(start < 10000) {
			int num = start;
			int length = (int)(Math.log10(start)+1);
			for(int i = 1; i <= length; i++) {
				num += (start % Math.pow(10, i)) / Math.pow(10, i-1);
			}
			if(num <= arr.length) arr[num-1] = false;
			start++;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == true) answer += i+1 + "\n";
		}
		
		System.out.println(answer);
	}
}
