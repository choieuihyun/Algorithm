package dynamicProgramming;

import java.util.Scanner;


public class RepeatQ10844 {
	
	static int N;
	int a = 10;
	
	static Long dp[][]; // �ڸ����� ǥ���� �� �ϳ�, �ڸ����� ǥ���� �� �ϳ�.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		dp = new Long[N+1][10]; // ��� ���� ������ �����س��� �迭��.
		
		for(int i = 0; i < 10; i++) { // �� �ڸ����� ���� �� 1���ϱ� 1����.
			dp[1][i] = 1L;
		}
		
		long result = 0;
		
		for(int i = 1; i < 10; i++) { // 
			result += find(N, i); // N = 2�� ���ڸ��� 1,2,3,4,5,6,7,8,9�߿� ã�ڴ�.
		}
		
		System.out.print(result % 1000000000);

	}
	
	static long find(int depth, int number) { // ��Ϳ��� �߿��Ѱ�. ������ ��� ������ �� ���̳�.
		
		if(depth == 1) {
			return dp[depth][number]; // �� �̰ɷ� ���� ���߰� �����ѵ�. �װ� �����̳�.
									  // ���̰� 2�� ������ ã�°Ŵϱ� �Է� �� 2�� �Է��� ����.
									  // �׷��ٸ� N = 2��� �ǵ� 2�� �ι�° �ڸ��̰� 2�� �Է��ؼ� �������� + 1�� �ϸ鼭 ���� ���� �ȵ��� ������.
		}
		
		if(dp[depth][number] == null) {
		
			if( number == 0 ) {
				
				dp[depth][number] = find(depth - 1, 1);
				
			}
			else if( number == 9 ) {
				
				dp[depth][number] = find(depth - 1, 8);
				
			}
			else {
				
				dp[depth][number] = find(depth - 1, number - 1) + find(depth - 1, number + 1);
				
			}
		
		}
		
		return dp[depth][number] % 1000000000L;
		
	}

}
