package baekjoon;

import java.util.Scanner;

public class Q3003 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] chess = {1,1,2,2,2,8};
		int[] donk = new int[6];
		
		for(int i = 0; i < chess.length; i++) {
			donk[i] = scanner.nextInt();

		}
		
		for(int i = 0; i < chess.length; i++) {
			System.out.print(chess[i] - donk[i] + " ");
		}
		
	}
}
