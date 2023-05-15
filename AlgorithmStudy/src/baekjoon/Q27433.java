package baekjoon;

import java.util.Scanner;

public class Q27433 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		Long i = scanner.nextLong();
		
		System.out.print(factorial(i));

	}
	
	public static long factorial(Long n) {
		
		if(n == 0) {
			
			n = 1L;
		}
		
		else
			return n * factorial(n-1);
		
		return n;
		
	}
}



