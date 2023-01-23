package baekjoon_step12;

import java.io.IOException;
import java.util.Scanner;

public class Q2798 {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int x = 0;
		int min = 300000;
		
		int [] blackJack = new int[a];
		
		
		for(int i = 0; i < blackJack.length; i++) {
			blackJack[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < blackJack.length; i++) {
			for(int j = i+1; j < blackJack.length; j++) {
				for(int k = j+1; k < blackJack.length; k++) {
					int sum = blackJack[i] + blackJack[j] + blackJack[k];
					if(b - sum < min && sum <= b) {
						min = b-sum;
						x = sum;
					}
				}
			}
		}
		
		System.out.print(x);
		
		
		

	}

}
