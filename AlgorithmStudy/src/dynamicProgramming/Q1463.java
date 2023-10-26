package dynamicProgramming;
import java.util.Scanner;

public class Q1463 {
	
	static Integer [] dp;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		dp = new Integer[X+1];
		
		dp[0] = 0; // top-down ����̶� �ʱ갪�� �ʿ��ϰ� �����غ��� �־���°� ����.
		dp[1] = 0;
		
		System.out.println(find(X));
		
		
	}
	
	static int find(int X) {
		
		// ��� ��Դµ� ���� �� �ȿ� ������ �������� ��.
		// �ᱹ ������ �ڵ��ϴ°� �״�� �����ϴ� �� ���̾�.
		// �� ��ü�� �־�ΰ� ����� ��ǻ�Ͱ� �Ѵٰ�.
		if(dp[X] == null) {
			
			if(X % 6 == 0) { // 6�϶��� 2�� 3 ���߿� �ϳ��� ���� �ּڰ��� 1�� ���� ���� �ּڰ� ��.
				
				dp[X] = Math.min(Math.min(find(X/3), find(X/2)), find(X-1)) + 1;
				
			}
			
			else if(X % 3 == 0) { // 3���� ������ ���� 1 ���� ���� ��. �̷������� �����°��� ���� �״��.
				
				dp[X] = Math.min(find(X/3), find(X-1)) + 1;

			}
			
			else if(X % 2 == 0) {
				
				dp[X] = Math.min(find(X-1), find(X/2)) + 1;
				
			}
			
			else {
				
				dp[X] = find(X-1) + 1;

			}
			
		}
		
		return dp[X];
		
	}


}
