package backtraking;

import java.util.Scanner;

public class Q15651 {
	
	static int N;
	static int M;
	static int [] array;
	static boolean [] visited;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		array = new int[M];
		visited = new boolean[N];
		
		dfs(N, M, 0);
		System.out.print(sb);

	}
	
	static void dfs(int N, int M, int depth) {
		
		if(depth == M) {
			for(int val : array) {
				sb.append(val + " ");
			}
			
			sb.append('\n');
			return;
		}
		
		for(int index = 0; index < N; index++) {
			
			if(!visited[index]) {
				
				array[depth] = index+1;
				dfs(N, M, depth + 1);
				
			}
			
			
		}
		
	}

}
