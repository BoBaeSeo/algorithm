package string;

import java.util.Scanner;

public class 숫자의합 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		scan.nextLine();
		char[] c = scan.nextLine().toCharArray();
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			sum += Integer.parseInt(String.valueOf(c[i]));
		}
		
		System.out.println(sum);
	}
}
