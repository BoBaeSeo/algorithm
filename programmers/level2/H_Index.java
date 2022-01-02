package level2;

import java.util.Arrays;
import java.util.Collections;

public class H_Index {
    public int solution(int[] citations) {
        Integer[] quotation = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(quotation, Collections.reverseOrder());
        int answer = 0;
        for (Integer i = 0; i < quotation.length; i++) {
            if (quotation[i] == i + 1 || (answer < i + 1 && i + 1 < quotation[i])) {
                answer = i + 1;
            }
        }
        return answer;
    }
}
