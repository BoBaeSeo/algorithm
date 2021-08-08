package BOJguide_ryute;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 수정렬하기2 {

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int N = in.nextInt();

		// list 계열 중 하나를 쓰면 된다.
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			list.add(in.nextInt());
		}

		Collections.sort(list);

		for (int value : list) {
			sb.append(value).append('\n');
		}
		System.out.println(sb);
	}
}
