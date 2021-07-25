package string;

import java.util.Scanner;

public class 단어의개수 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int count = 0;
		char pre = ' ';
		for(int i = 0; i < str.length(); i++) {
			if(pre == ' ' && str.charAt(i) != ' ') {
				count++;
			}
			pre = str.charAt(i);
		}
		System.out.println(count);
	}
}
