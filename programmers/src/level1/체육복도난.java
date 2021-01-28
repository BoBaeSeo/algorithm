package level1;

public class 체육복도난 {

	public static int solution(int n, int[] lost, int[] reserve) {
		int answer = n - lost.length;
		for (int i = 0; i < lost.length; i++) {
			for (int f = 0; f < reserve.length; f++) {
				if (lost[i] == reserve[f]) {
					reserve[f] = -1;
					lost[i] = -1;
					answer++;
					break;
				}
			}
		}
		for (int i : lost) {
			for (int j = 0; j < reserve.length; j++) {
				if (i + 1 == reserve[j] || i - 1 == reserve[j]) {
					reserve[j] = -1;
					answer++;
					break;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int n = 5;
		int[] lost = { 1, 2, 4, 5 };
		int[] reserve = { 2, 3, 4 };
		System.out.println(solution(n, lost, reserve));
	}
}
