package dynamicProgramming;

import java.util.Scanner;

public class Q9461ByFor {
	
	static long [] dp = new long [101];

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;
		
		while(T-- > 0) {
			
			System.out.println(padovan(sc.nextInt()));
			
		}

	}
	
	static long padovan(int T) {
		
		for(int i = 3; i <= T; i++) {
			
			dp[i] = dp[i-3] + dp[i-2];
			
		}
		
		return dp[T];
		
	}

}
