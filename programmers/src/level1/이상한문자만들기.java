package level1;

public class 이상한문자만들기 {

	public String solution(String s) {
		String answer = "";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			String str = s.substring(i, i + 1);
			if (!str.equals(" ")) {
				answer += count++ % 2 == 0 ? str.toUpperCase() : str.toLowerCase();
			} else {
				answer += " ";
				count = 0;
			}
		}
		return answer;
	}
}
