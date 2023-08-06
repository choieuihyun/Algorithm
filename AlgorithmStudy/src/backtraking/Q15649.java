package backtraking;

import java.util.Scanner;

// �Ƹ� ���� �ͼ�ġ �ʾƼ� �׷��� �� �ֽ��ϴ�. 
// dfs, bfs ���� �˰��� �η����� ���� ���� �ൿ�� �����Ͽ� �̸� �ݺ������� ȣ���ϴ� �۾��� �Ѵٰ� �����ϰ� �ۼ��ϴ� ������ �Ͻø� ���� �����Ͻ� �� ���� �̴ϴ� :)

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
