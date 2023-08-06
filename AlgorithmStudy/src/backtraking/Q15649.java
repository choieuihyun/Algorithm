package backtraking;

import java.util.Scanner;

// 아마 아직 익숙치 않아서 그러실 수 있습니다. 
// dfs, bfs 같은 알고리즘 부류들은 쉽게 말해 행동을 정의하여 이를 반복적으로 호출하는 작업을 한다고 생각하고 작성하는 연습을 하시면 쉽게 구현하실 수 있을 겁니다 :)

public class Q15649 {
	
	static int N, M;
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
		
		for(int index = 0; index < N; index++) {
		
			if (visited[index] == false) {
				
				visited[index] = true;
				array[depth] = index + 1;
				dfs(depth + 1);
				
				visited[index] = false;
			}
			
		}
		
	}
	
	
	

}
