package dynamicProgramming;

import java.util.Scanner;

public class RepeatQ2156 {
	
	static Integer dp[];
	static int wine[];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		dp = new Integer[N+1];
		wine = new int[N+1];
		
		dp[0] = wine[0] = 0;
		
		for(int i = 1; i <= N; i++) {
			wine[i] = sc.nextInt();
		}
		
		dp[1] = wine[1];
		
		if(N >= 2) {
			
			dp[2] = wine[1] + wine[2]; 
			
		}
		
		System.out.print(find(N));
		
		
	}
	
	static int find(int n) {
		
		if(dp[n] == null) {
			dp[n] = Math.max(Math.max(find(n-2), find(n-3) + wine[n-1]) + wine[n], find(n-1));
		}
		
		return dp[n];
		
	}
	
	
	
}


