package level1;

public class x만큼간격이있는n개의숫자 {

	public long[] solution(long x, int n) {
		long[] answer = new long[n];
		
		for(int i = 0; i < n; i++) {
			answer[i] = x * i;
		}
		
        return answer;
    }
}
