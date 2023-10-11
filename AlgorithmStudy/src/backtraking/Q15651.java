package backtraking;

import java.util.Scanner;

public class Q15651 {
	
	static int N,M;
	static boolean [] visited;
	static int [] array;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		visited = new boolean[N];
		array = new int[M];
		
		dfs(0);
		
	}
	
	static void dfs(int depth) {
		
		if(depth == M) {
			for(int val : array) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i < N; i++) {
			
			array[depth] = i+1;
			dfs(depth + 1);
			
		}
		
	}

}
