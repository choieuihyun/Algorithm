package baekjoon;

import java.util.Scanner;

public class Q7568 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int [][] array = new int [num][2];
		int [] resultArray = new int[num];
		
		for(int i = 0; i < num; i++) {
			array[i][0] = scanner.nextInt();
			array[i][1] = scanner.nextInt();
		}
		
		for(int i = 0; i < num; i++) { // 기준 행
			int rank = 1;
			for(int j = 0; j < num; j++) { // 비교대상이 되는 행들
				
				if(i == j)
					continue;
				
				if(array[i][0] < array[j][0] && array[i][1] < array[j][1])
					rank++;
				
				
			}
			resultArray[i] = rank;
		}
		
		for(int i = 0; i < num; i++) {
			System.out.print(resultArray[i] + " ");
		}
		
	}
}
