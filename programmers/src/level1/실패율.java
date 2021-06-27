package level1;

import java.util.Arrays;

public class 실패율 {

	public int[] solution(int N, int[] stages) {
        float[] counts = new float[N + 1];
        double[] fails = new double[N];
        for(int i : stages) {
        	counts[i - 1]++;
        }
        float player = stages.length;
        int[] answer = new int[N];
        for(int i = 0; i < N; i++) {
        	if(player > 0) {
        		fails[i] = (float) (counts[i] / player);
        		player -= counts[i];
        	}
        }
        double[] temp = fails.clone();
        Arrays.sort(temp);
        for(int i = N-1; i >= 0; i--) {
        	for(int j = 0; j < N; j++) {
        		if(temp[i] == fails[j]) {
        			fails[j] = -1;
        			answer[N-(i+1)] = j+1;
        			break;
        		}
        	}
        }
        return answer;
    }
}
