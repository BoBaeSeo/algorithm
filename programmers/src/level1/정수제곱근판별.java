package src.level1;

public class 정수제곱근판별 {
    public long solution(long n) {
        double result = Math.sqrt(n);
        if(result - (int) result == 0) {
            return (long) Math.pow(result + 1, 2);
        }
        return -1;
    }
}
