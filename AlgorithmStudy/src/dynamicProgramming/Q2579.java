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
		
		if(N >= 2) { // ���� ��ȹ���� ����� ��ŭ ������ ���(baseCondition)�� �����غ�����.
			
			dp[2] = stairs[1] + stairs[2]; // dp[2]�� ��(N) = 2 �� ���� �ش� ��(N)�� ��� ���� �ִ��� �ǹ���.
										   // �׷��ٸ� 2�� ����� ����� ���� �ִ��� ������ 1,2�� ��ƾ���.
										   // 2�� ��� �ϳ��� ���� 1�� ��� + 2�� ����� ������ Ŭ ���� ���ݾ�.
		}
		
		System.out.print(stair(N));


	}
	
	static int stair(int N) { // stair(N)�� N�� ����� �������߶�� �ؼ��� ����.
		
		if(dp[N] == null) {
			
			// N = 6�� ��츦 �ѱ۷� Ǯ�
			// 6�� ����� ����� ���� �ִ񰪿� (4�� ����� ����� ���� �ִ�, 3�� ����� ����� ���� �ִ� + 5�� ��ܰ�)�� ���ؼ� �� ū ���� 6�� ��ܰ��� ���ؼ� ��������.
			// ���⼭ �� stair() + stair[]�� ������ ���Գĸ� 6�� ����� ����� ���� dp[]���� ���� ������ �ִ��̱⿡
			// (dp[]�� ���� + ������ ����)���� �������� �� ������ ������ 4 -> 6 or 3 -> 5 -> 6�̱� ������.
			// �׷��� �������� ��, 3�� 4�� �ش� ��ȣ�� ����� ���� �� ������ �ִ��� �־�� ������ 5�� 6�� �ִ��� �ƴ϶� ����� ������ �����̱� ������ stairs[]�� ���� �״�� ���ϴ� ����.
			dp[N] = Math.max(stair(N-2), stair(N-3) + stairs[N-1]) + stairs[N];
		
		}
		
		return dp[N];

	}

}
