package level2;

import java.util.ArrayList;

public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        double minDays = Math.ceil((float)(100 - progresses[0]) / speeds[0]);
        double progressDays = 0;
        int distribution = 1;
        for (int i = 1; i < progresses.length; i++) {
            progressDays = Math.ceil((float)(100 - progresses[i]) / speeds[i]);
            if(minDays < progressDays) {
                answer.add(distribution);
                distribution = 0;
                minDays = 0;
            }
            if (minDays == 0) {
                minDays = progressDays;
            }
            if (minDays >= progressDays) {
                distribution++;
            }
        }
        if(minDays != 0 || distribution != 1) answer.add(distribution);
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
