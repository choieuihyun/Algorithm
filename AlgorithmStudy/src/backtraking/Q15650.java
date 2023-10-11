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
		
		visited = new boolean[N];
		array = new int[M];
		
		dfs(0, 1);
		
	}
	
	static void dfs(int depth, int a) {
		
		if(depth == M) { // baseCondition
			for(int val : array) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = a; i <= N; i++) {

				array[depth] = i;
				dfs(depth + 1, i+1);
			
			
		}
		
	}
	
	
	

	

}
