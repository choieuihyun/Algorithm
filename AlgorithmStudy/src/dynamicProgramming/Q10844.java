package dynamicProgramming;

import java.util.Scanner;

public class Q10844 {
	
	static Long [][] dp;
	static int N;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		dp = new Long[N+1][10]; // 여기에 계단 수의 갯수를 넣을 것이라고 생각을 하고 시작해야
		
		for(int i = 0; i < 10; i++) { // 한자리면 계단수가 하나씩 밖에 없음.
			dp[1][i] = 1L;
		}
		
		long result = 0;
		
		for(int i = 1; i < 10; i++) { // find(2,0) 같은 경우는 어떻게 해요? 01, 02 잖아요. 에 대한 답
			
			result += find(N, i);
			
		}
		
		System.out.println(result % 1000000000);
		
		
	}
	
	static long find(int depth, int value) {
		
		if(depth == 1)
			return dp[depth][value];
		
		if(dp[depth][value] == null) {
			
			if(value == 0) // 자릿수가 0이면 다음에 1밖에 못옴.
				dp[depth][value] = find(depth - 1, 1);
			
			else if(value == 9) // 자릿수가 9면 다음에 8밖에 못옴.
				dp[depth][value] = find(depth - 1, 8);
			
			else { // 나머지는 +-1로해서 올 수 있음.
				dp[depth][value] = find(depth - 1, value - 1) + find(depth - 1, value + 1);
			}
			
		}
		
		return dp[depth][value] % 1000000000L;
		
	}
	

}
