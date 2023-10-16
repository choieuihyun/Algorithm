package dynamicProgramming;

import java.util.Scanner;

public class RepeatQ1904 {
	
	static int [] dp = new int [1000001];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		
		for(int i = 3; i < dp.length; i++) {
			dp[i] = -1;
		}
		
		System.out.print(binary(N));
		
	}
	
	static int binary(int N) {
		
		if(dp[N] == -1)
			dp[N] = binary(N-1) + binary(N-2); // 어차피 binary()가 dp를 return하는 구조라 이렇게 해도 됨.
		
		return dp[N] % 15746; // 이거. 이게 왜 있는지를 생각좀 해라 이 멍청아.
		
	}

}
