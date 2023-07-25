package backtraking;

import java.util.Scanner;

// 아마 아직 익숙치 않아서 그러실 수 있습니다. 
// dfs, bfs 같은 알고리즘 부류들은 쉽게 말해 행동을 정의하여 이를 반복적으로 호출하는 작업을 한다고 생각하고 작성하는 연습을 하시면 쉽게 구현하실 수 있을 겁니다 :)

public class Q15649 {
	
	static int [] array;
	static boolean [] visited;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		array = new int[M];
		visited = new boolean[N];
		
		dfs(N, M, 0);
		
		
	}
	
	static void dfs(int N, int M, int depth) {
		
		if (depth == M) {
			
			for (int val : array) {
				System.out.println(val + " ");
			}
			
			System.out.println();
			return;
			
		}
		
		for (int index = 0; index < N; index++) {
			
			visited[index] = true;
			array[depth] = index + 1;
			dfs(N, M, depth + 1);
			visited[index] = false;
			
			
		}
		
	}

}
