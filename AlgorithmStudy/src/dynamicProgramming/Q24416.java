package dynamicProgramming;

import java.util.Scanner;

public class Q24416 {

	static int [] fibonacci;
	static int fibCount;
	static int fibonacciCount;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		fibonacci = new int [41];
		
		fib(n);
		fibonacci(n);
		
		System.out.println(fibCount);
		System.out.println(fibonacciCount);
		
	}
	
	static int fib(int n) {
		
		if(n == 1 || n == 2) {
			fibCount++;
			return 1;
		}
		else
			return fib(n-1) + fib(n-2);
		
	}
	
	static int fibonacci(int n) {
		fibonacci[1] = fibonacci[2] = 1;
		
		for(int i = 3; i <= n; i++) {
			fibonacciCount++;
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		
		return fibonacci[n];
	}
	
	

}
