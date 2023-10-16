package dynamicProgramming;

import java.util.Scanner;

public class RepeatQ1149 {
	
	static int [][] dp; // 이게 왜 2차원 배열이냐? -> 이거 모르면 걍 배열 공부 다시하셈.
	static int [][] house; // 그러면 여기는 왜 rgb 인데 2차원 배열? -> 이거 모르면 걍 배열 공부 다시하셈.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		house = new int[N][3];
		dp = new int [N][3];
		
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < 3; j++) {
				
				house[i][j] = sc.nextInt();
				
			}
			
		}
		
		dp[0][0] = house[0][0]; // 초기 값은 안변하니까 보통 채워놓음.
		dp[0][1] = house[0][1];
		dp[0][2] = house[0][2];
		
		System.out.print(Math.min(Math.min(rgb(N-1,0), rgb(N-1,1)), rgb(N-1,2)));

	}
	
	static int rgb(int N, int color) { // 여기서 n과 color, 왜 매개변수가 두개에요? -> 문제에 조건은 1번, 2번 만족하면 3번은 자동 만족임.
									   //									   그렇다면 재귀를 수행할 변수 하나와 조건을 만족시킬 변수 하나가 필요함.
									   // 									   알고리즘 자체가 그냥 어렵지만 너가 결국 동적 프로그래밍을 어려워 하는 이유는
									   // 									   개발자가 로직을 볼 수 있는 bottom-up이 아니라 top-down인 재귀라 그래
		if (dp[N][color] == 0) {
			
			if(color == 0) {
				
				return dp[N][color] = Math.min(rgb(N-1, 1), rgb(N-1, 2)) + house[N][color];
				
			}
			
			if(color == 1) {
				
				return dp[N][color] = Math.min(rgb(N-1, 0), rgb(N-1, 2)) + house[N][color];
				
			}
			
			if(color == 2) {
				
				return dp[N][color] = Math.min(rgb(N-1, 0), rgb(N-1, 1)) + house[N][color];
				
			}
			
		}
		
		return dp[N][color];
		
	}

}
