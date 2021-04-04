package step2if;

import java.util.Scanner;

public class 알람시계 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		if(m - 45 < 0) {
			h = (h-1) < 0 ? 23 : h-1;
			m = 60 + (m-45);
		} else {
			m -= 45;
		}
		System.out.printf("%d %d", h, m);
	}
}
