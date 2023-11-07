package dynamicProgramming;

import java.util.Scanner;

public class RepeatQ1904 {
	
	static Integer dp[];

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		dp = new Integer[N+1];
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		
		System.out.print(find(N));
		
		
	}
	
	static int find(int N) {
		
		if(dp[N] == null)
			dp[N] = find(N-1) + find(N-2);
		
		return dp[N] % 15746;
		
	}

}
