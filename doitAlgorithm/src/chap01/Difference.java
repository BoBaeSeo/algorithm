package chap01;

import java.util.Scanner;

// 두 변수 a, b에 정수를 입력하고 b - a를 출력하는 프로그램을 작성하세요.
// 단, 변수 b에 입력한 값이 a 이하면 변수 b의 값을 다시 입력하세요.

public class Difference {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a의 값을 입력하세요 : ");
		int a = scan.nextInt();
		
		int b;
		
		do {
			System.out.print("b의 값을 입력하세요 : ");
			b = scan.nextInt();
			if(b < a) System.out.println("a보다 큰 값을 입력하세요!");
		} while (b < a);
		
		System.out.printf("b - a는 %d입니다.", b-a);
		
	}
}
