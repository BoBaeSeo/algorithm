package level1;

public class 소수찾기 {
	// 효율성 테스트 실패
	 public static int solution2(int n) {
		int answer = 0;
		final long start = System.nanoTime();
		
		for(int i = 2; i <= n; i++) {
			answer++;
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					answer--;
					break;
				}
			}
		}
		
		final long end = System.nanoTime();
		System.out.println("run2 : " + (end - start) * 1e-9 + " sec");
        return answer;
    } 
	
	
	public static int solution(int n) {
		int answer = 0;
		final long start = System.nanoTime();

		boolean[] arr = new boolean[n+1];
		arr[0] = arr[1] = true;
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			
			if(arr[i]) continue;
			
			for(int j = i * i; j < arr.length; j += i) {
				arr[j] = true;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(!arr[i]) answer++;
		}
		final long end = System.nanoTime();
		System.out.println("run1 : " + (end - start) * 1e-9 + " sec");
        return answer;
    }
	
	public static void main(String[] args) {
		int n = 99999;
		int a = solution2(n);
		int b = solution(n);
		
		System.out.println(a + " : " + b);
	}
}
