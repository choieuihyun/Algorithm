package baekjoon_step4;

import java.util.Scanner;

public class Q4344 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		for(int i = 0; i < a; i++) {
			int sum = 0;
			float avg = 0;
			float count = 0;
			int b = scanner.nextInt();
			int [] stdScore = new int[b];
			
			for(int j = 0; j < b; j++) {
				int c = scanner.nextInt();
				stdScore[j] = c;
				sum += c;
			}
			
			for(int k = 0; k < b; k++) {
				if(stdScore[k] > sum/b) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count/stdScore.length)*100);
		}
	}

}
