package dynamicProgramming;

import java.util.Scanner;

public class RepeatQ2156 {
	
	static Integer dp[]; // 보통 2차원 배열 사용할 경우 뎁스가 있었지?
	static int wine[];

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		dp = new Integer [N+1];
		wine = new int [N+1];
		
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
	
	static int find(int N) {

		if(dp[N] == null) {
			
			dp[N] = Math.max(Math.max(find(N-2), find(N-3) + wine[N-1]) + wine[N], find(N-1)); // dp[N]이 N번째 잔을 마셨을 때의 최댓값인걸 인지좀 해라.
			
		}
		
		return dp[N];
		
	}

}
