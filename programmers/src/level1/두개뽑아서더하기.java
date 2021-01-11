package level1;

import java.util.Iterator;
import java.util.TreeSet;

public class 두개뽑아서더하기 {

	public int[] solution(int[] numbers) {
        int[] answer = {};
        TreeSet<Integer> numList = new TreeSet<Integer>();
        for(int i=0; i<numbers.length; i++){
            int a = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                int b = numbers[j];
                numList.add(a+b);
            }
        }
        answer = new int[numList.size()];
        Iterator<Integer> num = numList.iterator();
        
        for(int i=0; i<numList.size(); i++){
        answer[i] = num.next();
        }
        return answer;
    }
}
