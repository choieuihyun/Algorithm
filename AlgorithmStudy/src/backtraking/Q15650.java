package backtraking;

import java.util.Scanner;

public class Q15650 {
	
	static int N;
	static int M;
	static int [] array;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		array = new int[M];
		dfs(1, 0);
		
		
	}
	
	static void dfs(int a, int depth) {
		
		if(depth == M) {
			
			for(int val : array) {
				System.out.print(val + " ");
			}
			
			System.out.println();
			return;
		}
		
		for(int index = a; index < N+1; index++) {
			array[depth] = index;
			dfs(index + 1, depth + 1);
		}
		
	}
	

}
