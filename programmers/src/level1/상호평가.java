package src.level1;

public class 상호평가 {
    public String solution(int[][] scores) {
        String answer = "";
        int avgs[] = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            int self = scores[i][i];
            int checkMinOrMax = 0;
            for (int j = 0; j < scores.length; j++) {
                checkMinOrMax += self != scores[j][i] ? self > scores[j][i] ? 1 : -1 : 0;
                avgs[i] += scores[j][i];
            }
            if (Math.abs(checkMinOrMax) == scores.length - 1) {
                avgs[i] -= self;
                avgs[i] /= scores.length - 1;
            } else {
                avgs[i] /= scores.length;
            }
            answer += calGrade(avgs[i]);

        }
        return answer;
    }

    public String calGrade(int avg) {
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 50) return "D";
        else return "F";
    }
}
