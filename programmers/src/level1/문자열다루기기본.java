package level1;

public class 문자열다루기기본 {

	public boolean solution(String s) {
        boolean answer = true;
        if(s.length() < 4 || s.length() > 6 || s.length() == 5) {
        	answer = false;
        }
        if(answer) {
        	char[] c = new char[6];
       		c = s.toCharArray();
        	for(char a: c) {
        		if(a > 58  || a < 47) {
        			answer = false;
        		}
        	}
        }
        return answer;
    }
}
