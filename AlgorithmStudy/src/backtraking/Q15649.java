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
		
		if(depth == M) { // BaseCondition�� �� ����Ҳ���. depth�� ���� �Է��� M�� �������� ���� BaseCondition��.
			for(int val : array) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i < N; i++) { // �׷��� BaseCondition�� �ƴ� �� ���� Ž���Ϸ��� ������ ���� �ĺ����� ã�ƾ߰���?
			
			// ó���� �迭 �ʱ�ȭ�ϸ� �� false��.
			if(!visited[i]) { // ����ġ�� �ϴ� �κ�. �湮�� ���� ���� ����.
				
				array[depth] = i+1;
				visited[i] = true; // ����ġ�� �ϸ鼭 �湮�� ���� true�� �ٲ��༭ ������ �������� ����.
				dfs(depth + 1);
				visited[i] = false; // ���� �ܰ迡�� �ٽ� Ž���ؾ��ϴϱ� false�� �ٲ��ִ°�.
				
			}
			
		}
			
	}
	
}
