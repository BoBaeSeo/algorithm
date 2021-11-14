package src.level1;

public class 나머지가1이되는수찾기 {

	public int solution(int n) {
		boolean[] num = new boolean[n];
        int answer = 0;
        for(int i = 2; i < n; i++) {
        	if(num[i]) continue;
        	if((n-1) % i == 0) {
        		return i;
        	} else {
        		for(int j = i; j < n; j += i) {
        			num[j] = true;
        		}
        	}
        }
        return answer;
    }
}
