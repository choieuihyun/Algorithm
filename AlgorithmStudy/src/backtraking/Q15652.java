package backtraking;

import java.util.Scanner;

public class Q15652 {
	
	static int N,M;
	static int [] array;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		array = new int[M];
		
		dfs(1, 0);
		
		System.out.print(sb);
		
	}
	
	static void dfs(int a, int depth) {
	
		if (depth == M) {
			for(int val : array) {
				sb.append(val + " ");
			}
			
			sb.append('\n');
			return;
		}
		
		for(int index = a; index < N+1; index++) {
			
			array[depth] = index;
			dfs(index, depth+1);
			
		}
		
	}
	


}
