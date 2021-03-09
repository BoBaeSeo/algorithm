package level1;

public class Year2016 {

	public String solution(int a, int b) {
        String answer = "";
        String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;
        for(int i = 0; i < a-1; i++) {
        	sum += month[i];
        }
        int n = (sum + b) % 7;
        answer = days[(n+4)%7];
        return answer;
    }
}
