package arrayAndFunction;

public class 정수N개의합 {
	
	public static long sum(int[] a) {
		long sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
