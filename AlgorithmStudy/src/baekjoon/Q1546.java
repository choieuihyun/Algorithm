package baekjoon;

import java.util.Scanner;

public class Q1546 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int [] scoreArray = new int[num];
		
		float max = 0;
		float sum = 0;
		
		for(int i = 0; i < num; i++) {
			
			int score = scanner.nextInt();
			
			if(score > max)
				max = score;
			
			scoreArray[i] = score;
			
		}
		
		for(int i = 0; i < num; i++) {
			float newScore = (scoreArray[i]/max) * 100;
			sum += newScore;
			
		}
		
		System.out.print(sum/num);

	}

}
