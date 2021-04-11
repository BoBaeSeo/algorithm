package arrayAndFunction;

import java.util.Scanner;

public class OX퀴즈 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			char[] arr = scan.next().toCharArray();
			int num = 0, sum = 0;
			for(char c : arr) {
				if(c == 'O') {
					num++;
					sum += num;
				} else {
					num = 0;
				}
			}
			System.out.println(sum);
		}
		
	}
}
