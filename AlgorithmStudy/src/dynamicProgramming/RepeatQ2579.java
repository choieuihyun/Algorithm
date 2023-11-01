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
		
		if(N >= 2) { // �ϴ� �̰� �ϴ� ���� �߿��� ����. N = 2�϶� ������. find()���� �迭 ���� �ߺ���.
			dp[2] = stair[1] + stair[2]; // 3��° ��� ���ʹ� 1,3 1,2 ��� �ִ��� �������� ������ 2��° ��ܱ����� �������� ����.
			
			// �ڰ� ���� : �ٵ� dp[3]�̸� 1,2 / 1,3 / 2,3 �̷��� ��°� �����ѵ� �̰� �ùٸ� �����̿���?
			// �ڰ� �亯 : �ʰ� �����ϴ°� �̰� �ͼ����� �ʴ� ��� Ǯ�̶� �׷�. 2,3 ��� ���� ��Ϳ��� �˾Ƽ� 2,3���� ��Ƽ� ����ϰ���.
			//		     N�� ���� �Ǿ��� dp[2]�� 2��° ����� ��� ���� �� �ִ��̾�. 3���� ����̾ 2��° ������ ���Ѵٸ� ���� �ִ���.
			//     		 �̷��� �����ϸ鼭 �����ǵ� ��� �̷� �ּڰ��� �����س��°� �ڱ� ���ε� ���� ���� �κб����� �����س��� ����̴�.
			//           ��� ���� �� ������ dp[3]���� �� �־���Ƶ� ����� ������.
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
