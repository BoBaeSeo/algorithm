package chap01;

import java.util.Scanner;

// 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 아래 메서드를 작성하세요.
// a와 b의 대소 관계에 상관없이 합을 구하세요

public class SumOf {

	static int sumof(int a, int b) {
		int gap = Math.abs(a-b);
		
		int sum = (int) ((a + b) * Math.ceil((float) gap / 2));
		
		if(gap % 2 == 0) 
			sum += a <= b ?  a + (gap / 2) : b + (gap / 2);
			
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("a와 b를 포함하여 그 사이의 모든 정수의 합을 구합니다.");
		System.out.print("a의 값：");
		int a = scan.nextInt();
		System.out.print("b의 값：");
		int b = scan.nextInt();
		
		System.out.println("정수 a, b 사이의 모든 정수의 합은 " + sumof(a, b) + "입니다.");
	}
}
