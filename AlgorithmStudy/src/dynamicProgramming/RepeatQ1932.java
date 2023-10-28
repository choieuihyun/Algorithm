package dynamicProgramming;
import java.util.Scanner;

public class RepeatQ1932 {
	
	static int [][] tri;
	static Integer [][] dp;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		tri = new int[N][N];
		dp = new Integer[N][N];
		
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < i+1; j++) {
				
				tri[i][j] = sc.nextInt();
			
			}
			
		}
		
		dp[0][0] = tri[0][0];
		
	}
	
	static int triangle(int depth, int index) {
		
		if(dp[depth][index] == null) {
			
			dp[depth][index] = triangle(depth - 1, index - 1);
			
		}
		
		return dp[depth][index];
	}
}
