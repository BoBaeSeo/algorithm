package level1;

public class 문자열내p와y의개수 {

	boolean solution(String s) {
		boolean answer = true;
		int p = 0,y = 0;
		
		s.toLowerCase();
        
        for(int i = 0; i < s.length(); i++) {
        	if(s.substring(i, i+1).equals("p")) p++;
        	else if(s.substring(i, i+1).equals("y")) y++;
        }
        
        if(p != y) {
        	answer = false;
        }
        
        return answer;
    }
}
