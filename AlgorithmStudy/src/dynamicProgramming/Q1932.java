package dynamicProgramming;

import java.util.Scanner;

public class Q1932 {
	
	static int [][] triangleArr;
	static Integer [][] dp;
	static int N;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		triangleArr = new int[N][N];
		dp = new Integer[N][N];
		
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j <= i; j++) {
				triangleArr[i][j] = sc.nextInt();
			}
			
		}
		
		// dp 초기값 설정 + topDown이라고 무조건 dp[0]에 값을 넣는게 아니라 dp의 0부터 시작해서
		// dp의 맨 마지막이 기본값이 된 상태로 사용도 가능한거임.
		for(int i = 0; i < N; i++) {
			dp[N-1][i] = triangleArr[N-1][i];
		}
		
//		dp[0][0] = triangleArr[0][0]; 아니 항상 초기값 초기값 말하니까 생각없이 이렇게 둬버림.
//		max = triangleArr[0][0];
		
		System.out.println(triangle(0,0));

	}
	
	static int triangle(int depth, int index) {
		
		if(depth == N-1) { // 이 조건 때문에 static으로 썼는데 사실 파라미터로 받아도 됨. 그냥 깔끔하게 하려고 한거지.
						   // 이런게 은근 센스인듯.
			
			return dp[depth][index];
			
		} // 이렇게 안하고 if(dp[][] == null)인 상태에서 게산하라고 해도 되는데 탈출조건을 명시하는게 좋대.
		
		// 진짜 단순한거야. 최댓값이 저장될 dp[][]에 dp[0][0] 시작해서 한 층 아래의 같은 열, 한 층 아래의 다음 열을 비교해서 큰 값 + 기준이 되는 입력값.
		if(dp[depth][index] == null) {
			dp[depth][index] = Math.max(triangle(depth + 1, index), triangle(depth + 1, index + 1)) + triangleArr[depth][index];
		}
		// dp[3][3]은 dp[4][3], dp[4][4] 중에 큰 값 + 원래 삼각형 배열인  triangleArr[3][3] 을 더하는 것임.
		// 이와 같은 과정은 dp[0][0]에 가장 큰 값, dp[][]는 값이 역순으로 최댓값이 들어가는 구조이기 때문임.
		
		return dp[depth][index];
	}


}
