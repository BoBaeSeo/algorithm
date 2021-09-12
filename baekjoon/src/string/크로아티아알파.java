package src.string;

import java.util.Scanner;

public class 크로아티아알파 {
    public static void main(String[] args) {
        String ALP[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int answer = 0;

        for (int i = 0; i < ALP.length; i++) {
            if (str.contains(ALP[i])) {
                str = str.replaceAll(ALP[i], "!");
            }
        }
        answer += str.length();

        System.out.println(answer);
    }
}
