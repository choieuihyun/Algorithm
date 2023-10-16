package dynamicProgramming;

import java.util.Scanner;

public class RepeatQ9461 {
	
	static Long [] dp = new Long [101];

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		dp[0] = 0L;
		dp[1] = 1L;
		dp[2] = 1L;
		
		while(T-- > 0) {
			
			System.out.println(padovan(sc.nextInt()));
			
		}	
		

	}
	
	static Long padovan(int n) {
		
		if(dp[n] == null)
			dp[n] = padovan(n-2) + padovan(n-3);
		
		return dp[n];
	}

}
