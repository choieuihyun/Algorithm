package dynamicProgramming;
import java.util.Scanner;

public class RepeatQ1932 {
	
	static int tri[][];
	static Integer dp[][];
	static int N;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		tri = new int [N][N];
		dp = new Integer [N][N];
		
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j <= i; j++) {
				
				tri[i][j] = sc.nextInt();
 				
			}
			
		}
		
		for(int i = 0; i < N; i++) {
			
			dp[N-1][i] = tri[N-1][i];
			
		}
		
		System.out.println(triangle(0,0));
		
		
	}
	
	static int triangle(int depth, int index) {
		
		if(depth == N-1) // Àç±Í¸¦ ¸¶ÃÆÀ» ½ÃÀÇ Å»Ãâ Á¶°Ç. baseCondition
			return dp[depth][index];
		
		if(dp[depth][index] == null) {
			
			dp[depth][index] = Math.max(triangle(depth + 1, index), triangle(depth + 1, index + 1)) + tri[depth][index];
			
		}
		
		return dp[depth][index];
	}

}
