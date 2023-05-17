package baekjoon;

import java.util.Scanner;

public class Q2231 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int result = 0;
		
		for(int i = 0; i < a; i++) {
			
			int number = i;
			int sum = 0;
			
			while(number != 0) {
				
				sum += number % 10;
				number = number / 10;
				
			}
			
			if(a == sum + i) {
				result = i;
				break;
			}
			

		}
		
		System.out.print(result);
	}

}
