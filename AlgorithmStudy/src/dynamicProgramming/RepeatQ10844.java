package dynamicProgramming;

import java.util.Scanner;


public class RepeatQ10844 {
	
	static int N;
	int a = 10;
	
	static Long dp[][]; // 자릿수를 표현할 거 하나, 자릿값을 표현할 거 하나.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		dp = new Long[N+1][10]; // 계단 수의 갯수를 저장해놓는 배열임.
		
		for(int i = 0; i < 10; i++) { // 한 자릿수일 때는 다 1개니까 1이지.
			dp[1][i] = 1L;
		}
		
		long result = 0;
		
		for(int i = 1; i < 10; i++) { // 
			result += find(N, i); // N = 2면 두자릿수 1,2,3,4,5,6,7,8,9중에 찾겠다.
		}
		
		System.out.print(result % 1000000000);

	}
	
	static long find(int depth, int number) { // 재귀에서 중요한거. 조건이 어느 기준이 될 것이냐.
		
		if(depth == 1) {
			return dp[depth][number]; // 자 이걸로 식을 유추가 가능한데. 그게 무엇이냐.
									  // 길이가 2인 수에서 찾는거니까 입력 시 2로 입력할 것임.
									  // 그렇다면 N = 2라는 건데 2는 두번째 자리이고 2를 입력해서 뎁스에서 + 1을 하면서 가면 말이 안되지 범위가.
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
