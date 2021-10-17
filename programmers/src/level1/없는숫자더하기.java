package src.level1;

public class 없는숫자더하기 {

	public int solution(int[] numbers) {
		boolean[] check = new boolean[10];
		for(int num: numbers) {
			check[num] = true;
		}
		int answer = 0;
		for(int i = 0; i < check.length; i++) {
			if(!check[i]) {
				answer += i;
			}
		}
        return answer;
    }
}
