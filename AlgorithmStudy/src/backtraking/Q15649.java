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
		
		if(depth == M) { // BaseCondition일 때 출력할꺼야. depth가 내가 입력한 M과 동일해질 때가 BaseCondition임.
			for(int val : array) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i < N; i++) { // 그러면 BaseCondition이 아닐 때 내가 탐색하려는 범위에 따라 후보군을 찾아야겠지?
			
			// 처음에 배열 초기화하면 다 false임.
			if(!visited[i]) { // 가지치기 하는 부분. 방문한 곳은 가지 않음.
				
				array[depth] = i+1;
				visited[i] = true; // 가지치기 하면서 방문한 곳은 true로 바꿔줘서 가지가 쳐지도록 만듦.
				dfs(depth + 1);
				visited[i] = false; // 다음 단계에서 다시 탐색해야하니까 false로 바꿔주는것.
				
			}
			
		}
			
	}
	
}
