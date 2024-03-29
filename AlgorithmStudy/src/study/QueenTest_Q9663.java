package study;

import java.util.Scanner;

public class QueenTest_Q9663 {
	
	public static int[] arr;
	public static int N;
	public static int count = 0;
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		arr = new int[N];
 
		nQueen(0);
		System.out.println(count);
 
	}
 
	// [2,0,3,1]이면 index가 열, index의 값이 행이다.
	public static void nQueen(int depth) {
		// 모든 원소를 다 채운 상태면 count 증가 및 return 
		// 행을 다 채우면 카운트를 1 증가시키고 리턴 
		if (depth == N) {
			count++;
			return;
		}
 
		for (int i = 0; i < N; i++) {
			arr[depth] = i; // 1. array[0]에 0넣고 
			// 놓을 수 있는 위치일 경우 재귀호출
			// 해당 열에서 i 번째 행에 놓을 수 있는지를 검사하는 함수 
			if (Possibility(depth)) { // 2. Possibility(0)을 boolean 검사해서 true면 nQueen(1) 실행 
				nQueen(depth + 1);
			}
		}
 
	}

	public static boolean Possibility(int col) {
		
		for (int i = 0; i < col; i++) {
			// 해당 열의 행과 i열의 행이 일치할경우 (같은 행에 존재할 경우) 
			if (arr[col] == arr[i]) {
				return false;
			} 
			
			/*
			 * 대각선상에 놓여있는 경우
			 * 행의 차와 열의 차가 같을 경우가 대각선에 놓여있는 경우다)
			 */
			else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
				return false;
			}
		}
		
		return true;
	}

}
