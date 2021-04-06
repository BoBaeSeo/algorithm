package step3for;

import java.util.Scanner;

public class X보다작은수 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        String str = "";
        for(int i = 0; i < n; i++) {
        	int a = scan.nextInt();
        	if(a < x) {
        		str += a + " ";
        	}
        }
        System.out.println(str);
    }
}