package string;

import java.util.Scanner;

public class 문자열반복 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		String result = "";
		
		for(int i = 0; i < t; i++) {
			int r = scan.nextInt();
			String str = scan.next();
			result += repeat(r, str);
		}
		
		System.out.println(result);
		
	}
	
	public static String repeat(int n, String str) {
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < n; j++) {
				result += str.charAt(i);
			}
		}
		result += "\n";
		return result;
	}
}
