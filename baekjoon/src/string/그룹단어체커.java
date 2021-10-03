package src.string;

import java.util.ArrayList;
import java.util.Scanner;

public class 그룹단어체커 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = Integer.parseInt(scan.nextLine());
		int count = 0;
		
		for(int i = 0; i < N; i++) {
			String word = scan.nextLine();
			if(isGroupWord(word)) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	public static boolean isGroupWord(String word) {
		ArrayList<String> alpList = new ArrayList<String>();
		for(int i = 0; i < word.length(); i++) {
			String alp =  word.substring(i, i+1);
			if(!alpList.contains(alp)) {
				alpList.add(alp);
			} else if(word.charAt(i-1) != word.charAt((i))) {
				return false;
			}
		}
		return true;
	}
}
