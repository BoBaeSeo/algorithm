package arrayAndFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 평균은넘겠지 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(br.readLine());
		
		String answer = "";
		
		for(int i = 0; i < c; i++) {
			double upMem = 0;
			String[] strArr = br.readLine().split(" ");
			double sum = 0;
			for(int j = 1; j < strArr.length; j++) {
				sum += Integer.parseInt(strArr[j]);
			}
			double avg = sum / (double) Integer.parseInt(strArr[0]);
			
			for(int j = 1; j < strArr.length; j++) {
				int grade = Integer.parseInt(strArr[j]);
				if(grade > avg) {
					upMem++;
				}
			}
			answer += String.format("%.3f", (upMem / (double) Integer.parseInt(strArr[0])) * 100) + "%\n";
		}
		
		System.out.println(answer);
	}
}
