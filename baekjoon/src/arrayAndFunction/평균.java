package arrayAndFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 평균 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] strArr = br.readLine().split(" ");
		
		int max = 0;
		float sum = 0;
		for(int i = 0; i < n; i++) {
			if(max < Integer.parseInt(strArr[i])) {
				max = Integer.parseInt(strArr[i]);
			}
			sum += Integer.parseInt(strArr[i]);
		}
		
		System.out.println(Math.ceil((sum / max) * 100) / n);
	}
}
