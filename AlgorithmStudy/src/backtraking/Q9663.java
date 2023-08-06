package backtraking;

import java.util.Scanner;

public class Q9663 {
	
	static Scanner sc = new Scanner(System.in);
	static int N;
	static int [] array;
	static int count;
	
	public static void main(String[] args) {
		
		N = sc.nextInt();
		array = new int[N];
		count = 0;
		
		nQueen(0);
		System.out.print(count);
		
	}
	
	static void nQueen(int depth) {
		
		if(depth == N) {
			count++;
			return;
		}
		
		for(int index = 0; index < N; index++) {
			
			array[depth] = index;

			if(posibility(depth)) { // ���� �����ϸ� ���� ������ �Ѿ����. �˰��򿡼� ���� �߿��� �ɷ�? �ؼ� �ɷ��̶�� ����. 
				// �� posibility�� ������ ���ɼ��� boolean���� �˻��ϴ� �Լ��ε� ����, �� �ϳ��� ���鼭 �˻��Ѵ�. �̷� ������ �����ϰ� ®���� �� �� ®������.
				nQueen(depth + 1);
			}
			
		}
		
	}
	
	// [2,0,4,8]
	static boolean posibility(int col) {
		
		for(int i = 0; i < col; i++) {
			
			if(array[i] == array[col])
				return false;
		
			if(Math.abs(array[i] - array[col]) == Math.abs(i - col))
				return false;
			
		}
		
		return true;
		
	}
	

}
