package dynamicProgramming;

import java.util.Scanner;

public class Q2579 {
	
	static int stairs[];
	static Integer dp[];

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		stairs = new int [N+1];
		dp = new Integer [N+1];
		
		for(int i = 1; i < N+1; i++) {
			
			stairs[i] = sc.nextInt();
			
		}
		
		dp[0] = stairs[0];
		dp[1] = stairs[1];
		
		if(N >= 2) {
			
			dp[2] = stairs[1] + stairs[2];
			
		}
		
		System.out.print(stair(N));


	}
	
	static int stair(int N) { // stair()를 어떤 계단을 밟아야할까 라고 생각한다면.
		
		if(dp[N] == null) {
			
			dp[N] = Math.max(stair(N-2), stair(N-3) + stairs[N-1]) + stairs[N];
		
		}
		
		return dp[N];

	}

}
