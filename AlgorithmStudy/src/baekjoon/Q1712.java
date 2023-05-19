package baekjoon;

import java.util.Scanner;

public class Q1712 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(c-b <= 0) {
			System.out.print(-1);
		} else
			System.out.print(a/(c-b)+1);
		
		
		/* 21억번 반복하는 코드
		 * 
		 * long n = 0;
		 * 
		 * int count = 0;
		 * 
		 * while((n*c) <= a+(b*n)) {
		 * 
		 * n++;
		 * 
		 * }
		 * 
		 * if(b >= c) { n = -1; }
		 * 
		 * System.out.print(n);
		 */
	

	}

}
