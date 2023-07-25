package backtraking;

import java.util.Scanner;

// �Ƹ� ���� �ͼ�ġ �ʾƼ� �׷��� �� �ֽ��ϴ�. 
// dfs, bfs ���� �˰��� �η����� ���� ���� �ൿ�� �����Ͽ� �̸� �ݺ������� ȣ���ϴ� �۾��� �Ѵٰ� �����ϰ� �ۼ��ϴ� ������ �Ͻø� ���� �����Ͻ� �� ���� �̴ϴ� :)

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
