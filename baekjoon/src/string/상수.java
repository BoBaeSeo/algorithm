package string;

import java.util.Scanner;

public class 상수 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] str = scan.nextLine().split(" ");
		String n1 = "", n2 = "";
		for(int i = str[0].length(); i > 0; i--) {
			n1 += str[0].substring(i - 1, i);
			n2 += str[1].substring(i - 1, i);
		}
		System.out.println(Math.max(Integer.parseInt(n1), Integer.parseInt(n2)));
	}
}
