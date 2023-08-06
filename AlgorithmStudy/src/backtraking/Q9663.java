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

			if(posibility(depth)) { // 보통 가능하면 다음 뎁스로 넘어가야지. 알고리즘에서 가장 중요한 능력? 해석 능력이라고 본다. 
				// 이 posibility를 보더라도 가능성을 boolean으로 검사하는 함수인데 뎁스, 즉 하나씩 들어가면서 검사한다. 이런 식으로 생각하고 짰으면 더 잘 짰을꺼야.
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
