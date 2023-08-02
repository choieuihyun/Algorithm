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
			
			array[depth] = index; // depth가 index를 결정하는 것이 되니까 depth가 열이 되고 index가 값이므로 행이 된다 정도로 해석해도 되나? 
			
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
