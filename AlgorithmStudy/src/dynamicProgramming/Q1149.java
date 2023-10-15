package dynamicProgramming;

import java.util.Scanner;

public class Q1149 {
	
	static int [][] dp;
	static int [][] rgbArray;
	static int min;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		rgbArray = new int[N][3];
		dp = new int[N][3];

		
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j< 3; j++) {
				
				rgbArray[i][j] = sc.nextInt();
				
			}
			
		}
		
		// 메모이제이션에 초기값은 존재해야함. 그래야 재귀로 top-down 해서 왔을 때 계산하지.
		dp[0][0] = rgbArray[0][0]; // 말로 풀면 첫 번재 집의 색이 R.
		dp[0][1] = rgbArray[0][1]; // 말로 풀면 첫 번재 집의 색이 G.
		dp[0][2] = rgbArray[0][2];// 말로 풀면 첫 번재 집의 색이 B.
		
		System.out.println(Math.min(Math.min(rgb(N-1, 0), rgb(N-1, 1)), rgb(N-1, 2)));

	}
	
	static int rgb(int N, int color) {
		
		if (dp[N][color] == 0) { // 그냥 입코딩하는거 코드로 옮기면 돼. 말은 쉽지 하 ..
			
			if(color == 0)
				
				return dp[N][color] = Math.min(rgb(N-1, 1), rgb(N-1, 2)) + rgbArray[N][color];
			
			if(color == 1)
				
				return dp[N][color] = Math.min(rgb(N-1, 0), rgb(N-1, 2)) + rgbArray[N][color];
			
			if(color == 2)
				
				return dp[N][color] = Math.min(rgb(N-1, 0), rgb(N-1, 1)) + rgbArray[N][color];
			
		}
		
		return dp[N][color];
		
	}

}
