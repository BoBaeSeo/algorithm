package level2;

public class 일이사나라의숫자 {

	public static String solution(int n) {
		long digits = 0;
		long powNum = 0;
		String answer = "";
		while(true) {
			if(digits == 0) {
				answer += n % 3 == 0 ? "4" : n % 3;
				n -= 3;
				if(n > 0) {
					digits++;
				} else {
					return answer;
				}
				continue;
			} 
			powNum = (long) Math.pow(3, digits + 1);
			long rest = n % powNum;
			String check = rest == 0 ? "3" : 
				String.valueOf((long)(rest / Math.pow(3, digits)));
			switch(check) {
			case "0": 
				answer += "1";
				break;
			case "1": 
				if(rest % Math.pow(3, digits) == 0) answer += "1";
				else answer += "2";
				break;
			case "2":
				if(rest % Math.pow(3, digits) == 0) answer += "2";
				else answer += "4";
				break;
			default : 
				answer += "4";
			}
			digits++;
			n -= powNum;
			if(n <= 0) break;
		}
		StringBuffer sb = new StringBuffer(answer);
		answer = sb.reverse().toString();
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(30));
	}
}
