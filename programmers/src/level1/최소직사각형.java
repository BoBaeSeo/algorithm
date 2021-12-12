package src.level1;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int bigMax = 0;
        int smallMax = 0;
        for(int i = 0; i < sizes.length; i++) {
            int max = Integer.max(sizes[i][0], sizes[i][1]);
            int min = Integer.min(sizes[i][0], sizes[i][1]);
            if(bigMax < max) {
                bigMax = max;
            }
            if (smallMax < min) {
                smallMax = min;
            }
        }
        return bigMax * smallMax;
    }
}
