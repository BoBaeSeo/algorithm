package level1;

import java.util.Arrays;

public class 비밀지도 {

	public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[][] a1 = new int[n][n];
        int[][] a2 = new int[n][n];
        Arrays.fill(answer, "");
        for(int i = 0; i < n; i++) {
        	for(int j = n-1; j >= 0; j--) {
        		if(arr1[i] / Math.pow(2, j) >= 1) {
        			a1[i][j] = 1; 
        			arr1[i] -= Math.pow(2, j);
        			System.out.printf("a1[%d][%d] : %d\n",i,j,a1[i][j]);
        		} else {
        			a1[i][j] = 0;
        		}
        		if (arr2[i] / Math.pow(2, j) >= 1){
        			a2[i][j] = 1; 
        			arr2[i] -= Math.pow(2, j);
        			System.out.printf("a2[%d][%d] : %d\n",i,j,a2[i][j]);
        		} else {
        			a2[i][j] = 0;
        		}
        		if(a1[i][j] == 1 || a2[i][j] == 1) {
        			answer[i] += "#";
        		} else {
        			answer[i] += " ";
        		}
        	}
        }
        return answer;
    }
	
	
}
