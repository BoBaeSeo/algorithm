package arrayAndFunction;

import java.util.Scanner;

public class 한수 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if(n > 99) {
			int answer = 99;
			for(int i = 100; i <= n; i++) {
				int dif = i % 10 - (i / 10 % 10);
				if(i / 10 % 10 - i / 100 == dif) {
					answer++;
				} else {
					continue;
				}
			}
			System.out.println(answer);
		} else {
			System.out.println(n);
		}
	}
}
