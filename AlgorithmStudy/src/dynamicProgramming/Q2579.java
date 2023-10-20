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
		
		if(N >= 2) { // 동적 계획법은 재귀인 만큼 예외의 경우(baseCondition)을 생각해봐야함.
			
			dp[2] = stairs[1] + stairs[2]; // dp[2]란 값(N) = 2 에 따라 해당 값(N)의 결과 값중 최댓값을 의미함.
										   // 그렇다면 2번 계단을 밟았을 때의 최댓값은 무조건 1,2를 밟아야지.
										   // 2번 계단 하나의 값이 1번 계단 + 2번 계단의 값보다 클 수가 없잖아.
		}
		
		System.out.print(stair(N));


	}
	
	static int stair(int N) { // stair(N)을 N번 계단을 밟을꺼야라고 해석할 것임.
		
		if(dp[N] == null) {
			
			// N = 6일 경우를 한글로 풀어봄
			// 6번 계단을 밟았을 때의 최댓값에 (4번 계단을 밟았을 때의 최댓값, 3번 계단을 밟았을 때의 최댓값 + 5번 계단값)을 비교해서 더 큰 수와 6번 계단값을 더해서 넣을꺼야.
			// 여기서 왜 stair() + stair[]의 구조가 나왔냐면 6번 계단을 밟았을 때는 dp[]내의 값의 조건이 최댓값이기에
			// (dp[]의 조건 + 문제의 조건)으로 생각했을 때 가능한 구조가 4 -> 6 or 3 -> 5 -> 6이기 때문임.
			// 그렇게 생각했을 때, 3과 4는 해당 번호의 계단을 밟을 때 까지의 최댓값을 넣어야 겠지만 5와 6은 최댓값이 아니라 계산이 끝나는 지점이기 때문에 stairs[]의 값을 그대로 더하는 것임.
			dp[N] = Math.max(stair(N-2), stair(N-3) + stairs[N-1]) + stairs[N];
		
		}
		
		return dp[N];

	}

}
