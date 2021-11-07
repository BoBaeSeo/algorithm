package level2;

public class 문자열압축 {

	public int solution(String s) {
        int start = s.length() / 2;
        int minLength = s.length();
        
        while(start > 0) {
        	String word[] = new String[s.length()/ start];
        	int dupCount = 0;
        	int finalLength = s.length();
        	
        	for(int i = 0; i < s.length() / start; i++) {
        		word[i] = s.substring(i * start, (i+1)*start);
        		if(i > 0) {
        			// 앞 뒤 문자가 같지 않고 반복 되는 문자가 존재한다면
        			if(!word[i].equals(word[i-1]) && dupCount > 0) {
        				finalLength -= start * dupCount - (Math.log10(dupCount + 1) + 1);
        				dupCount = 0;
        			}
        			// 문자가 반복한다면 dupCoount 올리기
        			if(word[i].equals(word[i-1])) {
        				dupCount++;
        			} 
        		}
        	}
        	
        	if(dupCount > 0) {
        		finalLength -= start * dupCount - (Math.log10(dupCount + 1) + 1);
        	}
        	start--;
        	if(minLength > finalLength) {
        		minLength = finalLength;
        	}
        }
        return minLength;
    }
	
}
