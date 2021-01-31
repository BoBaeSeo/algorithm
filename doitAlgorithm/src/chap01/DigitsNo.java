package chap01;

import java.util.Scanner;

// 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요. 예를 들어 135를 입력하면
// '그 수는 3자리입니다.'라고 출력하고, 1314를 입력하면 '그 수는 4자리입니다.'라고 출력하면 됩니다.

public class DigitsNo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("숫자를 입력하세요: ");
			n = scan.nextInt();
			if(n < 0) System.out.println("양수를 입력해주세요!");
		} while (n < 0);
		
		int no = 1;	// 자릿수
		while(true) {
			n /= 10;	// n을 10으로 나눔
			no++;
			if(n < 10) break;
		}
		
		System.out.printf("그 수는 %d자리입니다.", no);
	}
}
