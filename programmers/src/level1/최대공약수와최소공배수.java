package src.level1;

public class 최대공약수와최소공배수 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        answer[0] = getMax(min, max);
        answer[1] = (min * max) / answer[0];
        return answer;
    }

    public static int getMax(int n, int m) {
        if (m % n == 0) {
            return n;
        } else {
            return getMax(m % n, n);
        }
    }

}
