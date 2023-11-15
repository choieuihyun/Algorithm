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
		
		// dp �ʱⰪ ���� + topDown�̶�� ������ dp[0]�� ���� �ִ°� �ƴ϶� dp�� 0���� �����ؼ�
		// dp�� �� �������� �⺻���� �� ���·� ��뵵 �����Ѱ���.
		for(int i = 0; i < N; i++) {
			dp[N-1][i] = triangleArr[N-1][i];
		}
		
//		dp[0][0] = triangleArr[0][0]; �ƴ� �׻� �ʱⰪ �ʱⰪ ���ϴϱ� �������� �̷��� �ֹ���.
//		max = triangleArr[0][0];
		
		System.out.println(triangle(0,0));

	}
	
	static int triangle(int depth, int index) {
		
		if(depth == N-1) { // �� ���� ������ static���� ��µ� ��� �Ķ���ͷ� �޾Ƶ� ��. �׳� ����ϰ� �Ϸ��� �Ѱ���.
						   // �̷��� ���� �����ε�.
			
			return dp[depth][index];
			
		} // �̷��� ���ϰ� if(dp[][] == null)�� ���¿��� �Ի��϶�� �ص� �Ǵµ� Ż�������� ����ϴ°� ����.
		
		// ��¥ �ܼ��Ѱž�. �ִ��� ����� dp[][]�� dp[0][0] �����ؼ� �� �� �Ʒ��� ���� ��, �� �� �Ʒ��� ���� ���� ���ؼ� ū �� + ������ �Ǵ� �Է°�.
		if(dp[depth][index] == null) {
			dp[depth][index] = Math.max(triangle(depth + 1, index), triangle(depth + 1, index + 1)) + triangleArr[depth][index];
		}
		// dp[3][3]�� dp[4][3], dp[4][4] �߿� ū �� + ���� �ﰢ�� �迭��  triangleArr[3][3] �� ���ϴ� ����.
		// �̿� ���� ������ dp[0][0]�� ���� ū ��, dp[][]�� ���� �������� �ִ��� ���� �����̱� ������.
		
		return dp[depth][index];
	}


}
