package string;

import java.util.Scanner;

public class 다이얼 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char cArr[] = scan.nextLine().toCharArray();
		
		int answer = 0; // 시간
		for(char a : cArr) { 
			if(a == 'S' || a== 'V' || a == 'Y' || a == 'Z') { // 예외처리
				answer += (a - 'A') / 3 + 2;
			} else {
				answer += (a - 'A') / 3 + 3;
			}
		}
		
		System.out.println(answer);
	}
}
