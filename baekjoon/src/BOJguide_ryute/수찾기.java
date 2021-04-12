package BOJguide_ryute;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 수찾기 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[] arrN = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arrN[i] = Integer.parseInt(st.nextToken());
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			if(contain(Integer.parseInt(st.nextToken()), arrN)) {
				bw.write(1 + "\n");
			} else {
				bw.write(0 + "\n");
			}
		}
		br.close();
		bw.close();
	}
	
	public static boolean contain(int num, int[] arr) {
		for(int i : arr) {
			if(i == num) return true;
		}
		return false;
	}
}
