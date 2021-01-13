package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사 {

	public int[] solution(int[] answers) {
		int[] answer = {};
		int[] person1 = {1,2,3,4,5};
		int[] person2 = {2,1,2,3,2,4,2,5};
		int[] person3 = {3,3,1,1,2,2,4,4,5,5};
		int count1 = 0, count2 = 0, count3 = 0;
		for(int i = 0; i < answers.length; i++) {
			if(answers[i] == person1[i%person1.length]) count1++;
			if(answers[i] == person2[i%person2.length]) count2++;
			if(answers[i] == person3[i%person3.length]) count3++;

		}
		int max = Math.max(count1, Math.max(count2, count3));
		ArrayList<Integer> maxPerson = new ArrayList<Integer>();
		if(max == count1) maxPerson.add(count1);
		if(max == count2) maxPerson.add(count2);
		if(max == count3) maxPerson.add(count3);
		answer = new int[maxPerson.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = maxPerson.get(i);
		}
		Arrays.sort(answer);
		
		return answer;
	}
}
