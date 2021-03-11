package level1;

public class 두정수사이의합 {

	public long solution(int a, int b) {
        long answer = 0;
        int max, min = 0;
        if(a>b) {
        	max = a;
        	min = b;
        } else {
        	max = b;
        	min = a;
        }
        for(int i = min; i < max + 1; i++) {
        	answer += i;
        }
        return answer;
    }
}
