package string;

import java.util.Scanner;

public class 아스키코드 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		char c = str.charAt(0);
		
		System.out.println(c - 0);
	}
}
