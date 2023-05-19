package baekjoon;


import java.util.Scanner;


public class Q1018 {
	
	static int min = 64;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		
		boolean [][] chessArray = new boolean [N][M];
		
		
		for(int i = 0; i < N; i++) {
			String s = scanner.next();
			for(int j = 0; j < M; j++) {
				if(s.charAt(j) == 'W')
					chessArray[i][j] = true;
				else
					chessArray[i][j] = false;
			}
		}

		int find_N = N - 7;
		int find_M = M - 7;
		
		for(int i = 0; i < find_N; i++) {
			for(int j = 0; j < find_M; j++) {
				find(chessArray, i, j);
			}
		}
		
		System.out.print(min);

	}
	
	static void find(boolean[][] array, int N, int M) {
		
		int max_N = N + 8;
		int max_M = M + 8;
		int count = 0;
	
		boolean wb = array[N][M];
		
		for(int i = N; i < max_N; i++) {
			for(int j = M; j < max_M; j++) {
				
				if(array[i][j] != wb)
					count++;
				
				wb = !wb;
			}
			
			wb = !wb;
		}
		
		count = Math.min(count, 64 - count);
		
		min = Math.min(min, count);
		
	}

}
