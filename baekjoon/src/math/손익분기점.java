package src.math;

import java.util.Scanner;

public class 손익분기점 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] input = scan.nextLine().split(" ");

		long plus = Integer.parseInt(input[2]) - Integer.parseInt(input[1]);
		
		if(plus > 0) {
			long answer = Integer.parseInt(input[0]) / plus + 1;
			System.out.println(answer);
		} else {
			System.out.println(-1);
		}
	}
}
