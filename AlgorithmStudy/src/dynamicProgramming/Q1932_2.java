package dynamicProgramming;

import java.util.Scanner;

public class Q1932_2 {
	
	static Integer [][] dp;
	static int [][] tri;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		dp = new Integer[N][N];
		tri = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j <= i; j++) {
				
				tri[i][j] = scanner.nextInt();
				
			}
			
		}
		
		dp[0][0] = tri[0][0];
		
		for(int i = 0; i < N; i++) {
			dp[N-1][i] = tri[N-1][i];
		}
		
		
		int result = 0;
		
		for(int i = 0; i < N + 1; i++) {
			
			result += find(N-1, N-1);
			
			
		}
		System.out.print(result);

	}
	
	static int find(int depth, int index) {
		
		if(depth == 0) {
			return dp[depth][index];
		}
		
		if(dp[depth][index] == null) {
			
			dp[depth][index] = Math.max(find(depth - 1, index), find(depth - 1, index - 1)) + tri[depth-1][index-1];
			
		}
		
		return dp[depth][index];
	}

}