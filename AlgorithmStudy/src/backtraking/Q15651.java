package backtraking;

import java.util.Scanner;

public class Q15651 {
	
	static int N,M;
	static int [] array;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		array = new int[M];
		
		dfs(0);
		System.out.print(sb);

	}
	
	static void dfs(int depth) {
		
		if(depth == M) {
			for(int val : array) {
				sb.append(val + " ");
			}
			
			sb.append('\n');
			return;
		}
		
		for(int index = 0; index < N; index++) {
			
			array[depth] = index+1;
			dfs(depth + 1);
			
		}
		
	}

}
