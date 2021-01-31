package chap01;
import java.util.Scanner;
// n이 7이면 '1+2+3+4+5+6+7=28'로 출력하는 프로그램을 작성하세요.

public class SumForEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("합을 구할 숫자를 입력해주세요: ");
		int n = scan.nextInt(); // 숫자 입력
		
		int sum = 0; // 합
		
		for(int i = 1; i <= n; i++) {
			sum += i;	// 합에 숫자 더하기
			if(i == n) System.out.printf("%d = %d", i, sum); 
			else System.out.printf("%d + ", i);
		}
	}
	
}
