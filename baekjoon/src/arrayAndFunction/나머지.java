package arrayAndFunction;

import java.util.Scanner;

public class 나머지 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[42];
		
		int count = 0;
		for(int i = 0; i < 10; i++) {
			int a = scan.nextInt();
			if(arr[a % 42] != 1) {
				arr[a % 42] = 1;
				count++;
			}
		}
		System.out.println(count);
		
	}
}
