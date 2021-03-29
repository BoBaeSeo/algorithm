package level1;

public class 약수의합 {

	public static int solution(int n) {
		int answer = 0;
		boolean[] arr = new boolean[n+1];
		if(n == 1) return 1;
		for(int i = 1; i < n; i++) {
			if(arr[i] == true) {
				continue;
			} else if(n % i == 0) {
				arr[n / i] = true;
				answer += i == n / i ? i : i + (n / i);
			}
		}
        return answer;
    }
	
}
