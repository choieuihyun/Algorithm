package baekjoon;

import java.util.Scanner;

public class Q2775 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int [][] apt = new int[15][15];
		
		int num = scanner.nextInt();


		for(int i = 0; i < 15; i++) {
			apt[0][i] = i;
			apt[i][1] = 1;
		}
		
		for(int j = 1; j < 15; j++) { // Ãþ
			
			for(int k = 2; k < 15; k++) { // È£¼ö
				apt[j][k] = apt[j][k-1] + apt[j-1][k];
			}
		}
		
		for(int s = 0; s < num; s++) {
		
			int k = scanner.nextInt();
			int n = scanner.nextInt();
			
			System.out.println(apt[k][n]);
		}
		
	}
}
