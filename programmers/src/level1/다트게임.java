package level1;

import java.util.Stack;

public class 다트게임 {

	public int solution(String dartResult) {
		int answer = 0;
		char[] resultArr = dartResult.toCharArray();
		// 점수를 담음 score 변수 선언
		String score = "";
		Stack<Integer> stack = new Stack<Integer>();
		// 임시 점수를 담을 tempScore 선언
		int tempScore = 0;
		// 이전 결과를 담을 tempResult 선언
		char tempResult = 0;
		// *이 연속으로 나오는지 확인할 count 변수 선언
		int count = 0;
		
		// 점수 계산 시작
		for (int i = 0; i < resultArr.length; i++) {
			// 숫자이면 실행
			if (48 <= resultArr[i] && resultArr[i] <= 57) {
				// 이전 결과가 *이나 #이 아니라면 answer에 바로 추가
				if (65 < tempResult) {
					answer += stack.peek();
				}
				// 점수 담기
				score += resultArr[i];
			// 문자이면 실행
			} else if (65 <= resultArr[i] && resultArr[i] <= 90) {
				// 문자 결과에 따라 다른 점수 입력
				switch (resultArr[i]) {
				case 83:
					stack.push(Integer.parseInt(String.valueOf(score)));
					break;
				case 68:
					stack.push((int) Math.pow(Integer.parseInt(String.valueOf(score)), 2));
					break;
				case 84:
					stack.push((int) Math.pow(Integer.parseInt(String.valueOf(score)), 3));
					break;
				}
				// 문자 결과가 끝나면 점수 초기화
				score = "";
				// 마지막 값이 문자이면 바로 answer에 값 추가
				if (i == resultArr.length - 1) {
					answer += stack.peek();
				}
			// * 이면 실행
			} else if (resultArr[i] == 42) {
				tempScore = stack.pop();
				if (!stack.empty()) {
					// *이 한 번인지 두 번인지 확인
					answer += count > 0 ? stack.peek() * 2 : stack.peek();
				}
				stack.push(tempScore);
				answer += tempScore * 2;
				count++;
			// # 이면 실행
			} else if (resultArr[i] == 35) {
				tempScore = stack.pop();
				answer -= tempScore;
				stack.push(-tempScore);
				count--;
			}
			tempResult = resultArr[i];
		}
		return answer;
	}

}
