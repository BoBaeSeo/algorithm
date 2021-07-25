package level1;

public class 키패드누르기 {

	public String solution(int[] numbers, String hand) {
        String answer = "";
        int lNum = -1;
        int rNum = -2;
        for(int num : numbers) {
        	if((num - 1) % 3 == 0) { // 1, 4, 7
        		answer += "L";
        		lNum = num;
        	} else if(num % 3 == 0 && num != 0) { // 3, 6, 9
        		answer += "R";
        		rNum = num;
        	} else { // 2, 5, 8, 0
        		String min = wherePosi(lNum, num) == wherePosi(rNum, num) ? hand.equals("left") ? "L" : "R" : wherePosi(lNum, num) > wherePosi(rNum, num) ? "R" : "L";
        		answer += min;
        		if(min.equals("R")) rNum = num;
        		else lNum = num;
        	}
        }
        return answer;
    }
	
	static int wherePosi(int temp, int answer) {
		int[][] position = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {-1, 0, -2}};
		if(temp == answer) return 0;
		int[] tmpPosi = new int[2]; // 왼쪽 또는 오른쪽의 위치
		int[] ansPosi = new int[2]; // number 위치
		for(int i = 0; i < position.length; i++) {
			for(int j = 0; j < position[0].length; j++) {
				if(position[i][j] == temp) {
					tmpPosi[0] = i;
					tmpPosi[1] = j;
				} else if(position[i][j] == answer) {
					ansPosi[0] = i;
					ansPosi[1] = j;
				}
			}
		}
		int returnValue = Math.abs(tmpPosi[0] - ansPosi[0]) + Math.abs(tmpPosi[1] - ansPosi[1]);
		return returnValue;
	}
}
