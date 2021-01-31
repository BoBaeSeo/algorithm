package chap01;

import java.util.Scanner;

// 1부터 10까지의 합은 (1 + 10) * 5와 같은 방법으로 구할 수 있습니다.
// 가우스의 덧셈이라는 방법을 이용하여 1부터 n까지의 정수 합을 구하는 프로그램을 작성하세요.

public class SumGauss {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("합을 구할 숫자를 입력해주세요: ");
		int n = scan.nextInt();	// 입력 받을 숫자
		
		int sum = 0;	// 합
		
		sum = (1 + n) * (n / 2);
		System.out.println(sum);
		
		if(n % 2 == 1) {
			sum += Math.ceil((float) n / 2);
		}
		
		System.out.println(sum);
	}
}
