package dynamicProgramming;

import java.util.Scanner;

public class Q1904byFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.print(binary(n));
		

	}
	
	static int binary(int n) {
		
		if(n == 0) 
			return 0;
		
		if(n == 1)
			return 1;
		
		if(n == 2)
			return 2;
		
		int sum = 0;
		int a = 1;
		int b = 2;
		
		for(int i = 3; i <= n; i++) {
			
			sum = a+b;
			a = b;
			b = sum;
			
		}
		
		return sum;
		
	}

}
