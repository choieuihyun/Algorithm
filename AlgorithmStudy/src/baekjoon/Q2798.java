package baekjoon;

import java.util.Scanner;

public class Q2798 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int max = 0;
		int min = 300000;
		
		int [] array = new int[a];
		
		for(int i = 0; i < a; i++) {
			array[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < a-2; i++) {
			
			for(int j = i+1; j < a-1; j++) {
				
				for(int k = j+1; k < a; k++) {

						int sum = array[i] + array[j] + array[k];
	
						if(b - sum < min && sum <= b) {
							min = b - sum;
							max = sum;
						}
						
					}
						
				}
				
			}
		System.out.print(max);
	}
	
}


