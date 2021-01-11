package level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		Map<String, Integer> p = new HashMap<String, Integer>();
		for(String participantPerson : participant) {
			p.put(participantPerson, p.getOrDefault(participantPerson, 0)+1);
			
		}
		for(String completPerson : completion) {
			if(p.get(completPerson) == 1) {
				p.remove(completPerson);
			} else {
				p.replace(completPerson, p.get(completPerson)-1);
			}
		}
		answer = String.join("", p.keySet());
		return answer;
	}
	
    public static void main(String[] args) {
    	String[] participant = {"aleo", "kiki", "eden", "leo"};
    	String[] completion = {"eden", "kiki", "aleo"};
		String i = solution2(participant, completion);
		System.out.println(i);
	}
    
    static String solution2(String[] participant, String[] completion) {
    	String answer = "";
    	Arrays.sort(participant);
    	Arrays.sort(completion);
    	answer = participant[participant.length-1];
    	for(int i=0; i<completion.length; i++) {
    		if(!participant[i].equals(completion[i])) {
    			answer = participant[i];
    			return answer;
    		}
    	}
    	return answer;
    }
}
