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
        int result = countR + countZ;
		int[] answer = {7 - result, 7 - (result - countZ) > 6 ? 6 : 7 - (result - countZ)};
        return answer;
    }
}
