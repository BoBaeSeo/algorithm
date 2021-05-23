package string;

import java.util.HashMap;
import java.util.Scanner;

public class 알파벳찾기 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char[] arr = scan.next().toCharArray();
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			if(!map.containsKey(String.valueOf(arr[i]))) {
				map.put(String.valueOf(arr[i]), i);
			}
		}
		
		for(char c = 97; c < 123; c++) {
			if(map.containsKey(String.valueOf(c))) {
				System.out.print(map.get(String.valueOf(c)) + " ");
			} else {
				System.out.print(-1 + " ");
			}
		}
	}
	
	
}
