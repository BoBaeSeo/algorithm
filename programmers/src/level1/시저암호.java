package level1;

public class 시저암호 {

	public String solution(String s, int n) {
		char[] arr = s.toCharArray();
		String answer = "";
		for(char c : arr) {
			answer += push(c, n);
		}
        return answer;
    }
	
	public char push(char c, int n) {
		if(c == 32) {
			return c;
		} else if (65 <= c && c <= 90) {
			return (char) ((c + n) > 90 ? c + n - 26 : c + n);
		} else {
			return (char) ((c + n) > 122 ? c + n - 26 : c + n);
		}
	}
}
