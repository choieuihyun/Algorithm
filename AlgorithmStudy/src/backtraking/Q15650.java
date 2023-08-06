package backtraking;

import java.util.Scanner;

public class Q15650 {
	
	static int N,M;
	static int [] array;
	static boolean [] visited;
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		array = new int[M];
		visited = new boolean[N];
		
		dfs(0, 1);
		
	}
	
	static void dfs(int depth, int x) {
		
		if(depth == M) {
			for(int val : array) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		
		for(int index = x; index <= N; index++) {
			
				array[depth] = index;
				dfs(depth + 1, index + 1);
				
			
		}
		
	}
	

}
