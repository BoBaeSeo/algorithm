package string;

import java.util.Scanner;

public class 단어공부 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] checkCount = new int[26];
		String str = scan.next().toUpperCase();
		char[] cArr = str.toCharArray();
		
		for(char c : cArr) {
			checkCount[c-'A']++;
		}
		
		int max = 0;
		int idx = -1;
		for(int i = 0; i < checkCount.length; i++) {
			if(max < checkCount[i]) {
				max = checkCount[i];
				idx = i;
			} else if (max == checkCount[i]) {
				idx = -1;
			}
		}

		if(idx == -1) {
			System.out.println('?');
		} else {
			System.out.println((char)(idx + 'A'));
		}
	}
}
