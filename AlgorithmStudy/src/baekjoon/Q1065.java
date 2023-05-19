package baekjoon;

import java.util.Scanner;

public class Q1065 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		hansu(num);
	}
	
	static void hansu(int num) {
		
		int count = 0;
		
		for(int i = 1; i < num+1; i++) {
			int first = i/100;
			int second = (i%100) / 10;
			int third = i%10;
			
			if(first == 0)
				count++;
			else if((third-second) == (second-first))
				count++;
		}
		System.out.print(count);
	}

}
