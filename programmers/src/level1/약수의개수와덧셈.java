package src.level1;

public class 약수의개수와덧셈 {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i <= right; i++) {
            double result = Math.sqrt(i);
            if(result - (int) result == 0) {
                answer -= i;
                continue;
            }
            answer += i;
        }
        return answer;
    }
}
