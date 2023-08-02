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
		
		if(N == depth) {
			count++;
			return;
		}
		
		for(int index = 0; index < N; index++) {
			
			array[depth] = index; // depth�� index�� �����ϴ� ���� �Ǵϱ� depth�� ���� �ǰ� index�� ���̹Ƿ� ���� �ȴ� ������ �ؼ��ص� �ǳ�? 
			
			if (posibility(depth)) {
				nQueen(depth + 1);
			}
			
		}
		
		
	}
	
	static boolean posibility(int col) {
		
		for(int index = 0; index < col; index++) {
			
			if(array[index] == array[col])
				return false;
			
			if(Math.abs(array[index] - array[col]) == Math.abs(index - col)) {
				return false;
			}
			
		}
		return true;
	}
	
	

}
