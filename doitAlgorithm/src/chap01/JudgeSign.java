package chap01;
import java.util.Scanner;
// 입력한 정숫값이 양수인지 음수인지 0인지 판단합니다.
public class JudgeSign {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int n = scan.nextInt();
		
		if(n > 0) System.out.printf("%d는 : 양수입니다.\n", n);
		else if(n < 0) System.out.printf("%d수는 : 음수입니다.\n", n);
		else System.out.printf("%d수는 : 0입니다.", n);
	}
}
