package step3for;

import java.util.Scanner;

public class 구구단 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", n, i, i*n);
		}
	}
}
