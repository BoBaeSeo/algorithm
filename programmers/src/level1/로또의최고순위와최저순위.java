package level1;

public class 로또의최고순위와최저순위 {

	public int[] solution(int[] lottos, int[] win_nums) {
		int countR = 0;
        int countZ = 0;
        for(int i : lottos) {
        	for(int j : win_nums) {
        		if(i == j) countR++;
        	}
        	if(i == 0) countZ++;
        }
        int upResult = 7 - (countR + countZ) > 6 ? 6 : 7 - (countR + countZ);
        int downResult = 7 - countR > 6 ? 6 : 7 - countR;
		int[] answer = {upResult, downResult};
        return answer;
    }
}
