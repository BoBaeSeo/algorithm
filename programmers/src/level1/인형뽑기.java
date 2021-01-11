package level1;

import java.util.Stack;

public class 인형뽑기 {

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> dolls = new Stack<Integer>();
        for(int i=0; i < moves.length; i++){
        	for(int j=0; j < board.length; j++) {
        		if(board[j][moves[i]-1] != 0) {
        			if(dolls.size() == 0) {
        				dolls.push(board[j][moves[i]-1]);
        				board[j][moves[i]-1] = 0;
            			break;
        			}
        			if(dolls.peek() == board[j][moves[i]-1]) {
        				dolls.pop();
        				answer += 2;
        			} else {
        				dolls.push(board[j][moves[i]-1]);
        			}
        			board[j][moves[i]-1] = 0;
        			break;
        		} 
        	}
        }
        return answer;
    }
    
    public static void main(String[] args) {
    	int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
    	int[] moves = {1,5,3,5,1,2,1,4};
		int i = solution(board, moves);
		System.out.println(i);
	}
    
}
