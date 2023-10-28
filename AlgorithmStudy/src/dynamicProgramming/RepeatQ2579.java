package dynamicProgramming;

import java.util.Scanner;

public class RepeatQ2579 {
	
	static Integer dp[];
	static int stair[];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		dp = new Integer[N+1];
		stair = new int[N+1];
		
		for(int i = 1; i < N+1; i++) {
			stair[i] = sc.nextInt();
		}
		
		dp[0] = stair[0] = 0;
		dp[1] = stair[1];
		
		if(N >= 2)
			dp[2] = stair[1] + stair[2];
		
		System.out.print(find(N));

	}
	
	static int find(int N) {
		
		if(dp[N] == null) {
			
			dp[N] = Math.max(find(N-2), find(N-3) + stair[N-1]) + stair[N];
			
		}
			
		return dp[N];
		
	}

}
