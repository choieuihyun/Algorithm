package dynamicProgramming;

import java.util.Scanner;

public class Q10844 {
	
	static Long [][] dp;
	static int N;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		dp = new Long[N+1][10]; // ���⿡ ��� ���� ������ ���� ���̶�� ������ �ϰ� �����ؾ�
		
		for(int i = 0; i < 10; i++) { // ���ڸ��� ��ܼ��� �ϳ��� �ۿ� ����.
			dp[1][i] = 1L;
		}
		
		long result = 0;
		
		for(int i = 1; i < 10; i++) { // find(2,0) ���� ���� ��� �ؿ�? 01, 02 �ݾƿ�. �� ���� ��
			
			result += find(N, i);
			
		}
		
		System.out.println(result % 1000000000);
		
		
	}
	
	static long find(int depth, int value) {
		
		if(depth == 1)
			return dp[depth][value];
		
		if(dp[depth][value] == null) {
			
			if(value == 0) // �ڸ����� 0�̸� ������ 1�ۿ� ����.
				dp[depth][value] = find(depth - 1, 1);
			
			else if(value == 9) // �ڸ����� 9�� ������ 8�ۿ� ����.
				dp[depth][value] = find(depth - 1, 8);
			
			else { // �������� +-1���ؼ� �� �� ����.
				dp[depth][value] = find(depth - 1, value - 1) + find(depth - 1, value + 1);
			}
			
		}
		
		return dp[depth][value] % 1000000000L;
		
	}
	

}
