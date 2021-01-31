package chap01;
// 네 값의 최댓값을 구하는 max4 메서드를 작성하세요.
public class Max4 {

	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("max4(1,2,3,4) = " + max4(1,2,3,4));
		System.out.println("max4(1,2,4,3) = " + max4(1,2,4,3));
		System.out.println("max4(1,4,2,3) = " + max4(1,4,2,3));
		System.out.println("max4(4,1,2,3) = " + max4(4,1,2,3));
		System.out.println("max4(1,4,3,2) = " + max4(1,4,3,2));
		System.out.println("max4(4,2,1,3) = " + max4(4,2,1,3));
		System.out.println("max4(4,2,3,1) = " + max4(4,2,3,1));
		System.out.println("max4(4,3,2,1) = " + max4(4,3,2,1));
	}
}
