package src.level1;

import java.util.Arrays;

public class 정수내림차순으로배치하기 {

	public long solution(long n) {
		int length = (int) Math.log10(n) + 1;
		int[] numbers = new int[length];
		
		for(int i = 1; i <= length; i++) {
			numbers[i-1] = (int) (n % (Math.pow(10, i)) / Math.pow(10, i-1));
		}
		Arrays.sort(numbers);
		
		String answer = "";
		for(int i = length - 1; i >= 0; i--) {
			answer += numbers[i];
		}
		
        return Long.parseLong(answer);
    }
}
