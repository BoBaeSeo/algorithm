package level1;

public class 가운데글자가져오기 {

	public static String solution(String s) {
        String answer = "";
        int middle = s.length()/2;
        if(s.length() % 2 == 0) {
        	answer = s.substring(middle-1, middle+1);
        } else {
        	answer = s.substring(middle, middle+1);
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String s = "adkejfkd";
		solution(s);
	}
	
}
