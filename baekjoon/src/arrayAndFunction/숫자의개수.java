package arrayAndFunction;

import java.io.IOException;
import java.util.Scanner;

public class 숫자의개수 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
		long num = a * b * c;
		int len = (int)(Math.log10(num) + 1);
		int[] arr = new int[10];
		
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < 10; j++) {
				if(j == num % 10) {
					arr[j]++;
				}
			}
			num /= 10;
		}

		for(int i : arr) {
			System.out.println(i);
		}
	}
}