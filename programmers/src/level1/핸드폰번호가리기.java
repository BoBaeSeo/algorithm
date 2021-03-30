package level1;

public class 핸드폰번호가리기 {

	public String solution(String phone_number) {
		String num = phone_number.substring(phone_number.length()-4, phone_number.length());
		String answer = "";
		for(int i = 0; i < phone_number.length()-4; i++) {
			answer += "*";
		}
		answer += num;
        return answer;
    }
	
}
