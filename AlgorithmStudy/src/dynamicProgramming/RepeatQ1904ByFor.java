package dynamicProgramming;

import java.util.Scanner;

public class RepeatQ1904ByFor {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		
		System.out.print(binary(N));
		
	}
	
	static long binary(long N) {
		
		if(N == 0)
			return 0;
		
		if(N == 1)
			return 1;
		
		if(N == 2)
			return 2;
		
		long a = 1;
		long b = 2;
		long sum = 0;
		
		for(long i = 3; i <= N; i++) {
			sum = (a + b) % 15746;
			a = b;
			b = sum;
		}
		
		return sum;
		
	}

}
