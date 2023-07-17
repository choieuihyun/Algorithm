package study;

import java.util.Scanner;

public class fibonacci {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(recurFibonacci(scanner.nextInt()));
		
		
	}
	
	static int recurFibonacci(int a) {
		
		if(a == 0)
			return 0;
		
		if(a == 1)
			return 1;
		
		return recurFibonacci(a-1) + recurFibonacci(a-2);
	}


	

}
