package dynamicProgramming;

import java.util.Scanner;

public class RepeatQ2579 {
	
	static Integer [] dp;
	static int [] stair;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		dp = new Integer[N+1];
		stair = new int [N+1];
		
		for(int i = 1; i < N + 1; i++) {
			
			stair[i] = sc.nextInt();
			
		}
		
		dp[0] = stair[0];
		dp[1] = stair[1];
		
		if(N >= 2) { // 일단 이거 하는 가장 중요한 이유. N = 2일때 에러남. find()에서 배열 범위 잘보셈.
			dp[2] = stair[1] + stair[2]; // 3번째 계단 부터는 1,3 1,2 라는 최댓값의 선택지가 있지만 2번째 계단까지는 선택지가 없음.
			
			// 자가 질문 : 근데 dp[3]이면 1,2 / 1,3 / 2,3 이렇게 밟는게 가능한데 이게 올바른 조건이에요?
			// 자가 답변 : 너가 착각하는게 이게 익숙하지 않는 재귀 풀이라 그래. 2,3 밟는 경우면 재귀에서 알아서 2,3으로 밟아서 계산하겠지.
			//		     N이 뭐가 되었든 dp[2]는 2번째 계단을 밟고 있을 때 최댓값이야. 3개의 계단이어도 2번째 까지만 구한다면 저게 최대라고.
			//     		 이렇게 생각하면서 느낀건데 사실 이런 최솟값을 설정해놓는건 자기 맘인데 가장 편한 부분까지만 설정해놓는 기분이다.
			//           사실 구할 수 있으면 dp[3]까지 다 넣어놓아도 상관은 없겠지.
		}
		
		System.out.print(find(N));
		
	}
	
	static int find(int N) {
		
		if(N == 0) {
			return dp[N];
		}
		
		if(dp[N] == null) {
			
			dp[N] = Math.max(find(N-2), find(N-3) + stair[N-1]) + stair[N];
			
		}
		
		return dp[N];
		
		
	}

}
