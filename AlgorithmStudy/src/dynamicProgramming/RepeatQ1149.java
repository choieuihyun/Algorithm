package dynamicProgramming;

import java.util.Scanner;

public class RepeatQ1149 {
	
	static int [][] dp; // �̰� �� 2���� �迭�̳�? -> �̰� �𸣸� �� �迭 ���� �ٽ��ϼ�.
	static int [][] house; // �׷��� ����� �� rgb �ε� 2���� �迭? -> �̰� �𸣸� �� �迭 ���� �ٽ��ϼ�.

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
		
		dp[0][0] = house[0][0]; // �ʱ� ���� �Ⱥ��ϴϱ� ���� ä������.
		dp[0][1] = house[0][1];
		dp[0][2] = house[0][2];
		
		System.out.print(Math.min(Math.min(rgb(N-1,0), rgb(N-1,1)), rgb(N-1,2)));

	}
	
	static int rgb(int N, int color) { // ���⼭ n�� color, �� �Ű������� �ΰ�����? -> ������ ������ 1��, 2�� �����ϸ� 3���� �ڵ� ������.
									   //									   �׷��ٸ� ��͸� ������ ���� �ϳ��� ������ ������ų ���� �ϳ��� �ʿ���.
									   // 									   �˰��� ��ü�� �׳� ������� �ʰ� �ᱹ ���� ���α׷����� ����� �ϴ� ������
									   // 									   �����ڰ� ������ �� �� �ִ� bottom-up�� �ƴ϶� top-down�� ��Ͷ� �׷�
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
