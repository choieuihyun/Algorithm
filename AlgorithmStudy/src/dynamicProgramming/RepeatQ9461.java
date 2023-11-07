package dynamicProgramming;

import java.util.Scanner;

public class RepeatQ9461 {
	
	static Integer dp[];

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		while(N-- > 0) {
			
			int a = scanner.nextInt();

			dp = new Integer[a+1];
			
			
			dp[0] = 0;
			dp[1] = 1;
			dp[2] = 1;
			
			System.out.println(find(a));
			
		}
		

		

		

	}
	
	static int find(int N) {
		
		if(dp[N] == null) {
			dp[N] = find(N-2) + find(N-3);
		}
		
		return dp[N];
		
	}

}
