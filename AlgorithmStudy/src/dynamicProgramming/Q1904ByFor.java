package dynamicProgramming;

import java.util.Scanner;

public class Q1904ByFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.print(binary(n));
		

	}
	
	static int binary(int n) {
		
		// baseCondition은 항상 생각해야함.
		if(n == 0) 
			return 0;
		
		if(n == 1)
			return 1;
		
		if(n == 2)
			return 2;
	
		// 바꿀 때 생각 과정 
		// 1 2 3 5 8 13 21 34 이렇게 가는 수열에 가장 필요한게 뭐냐?
		// 두개의 합, 앞의 수를 뒤의 수로 변경, 뒤의 수를 합으로 변경.
		// 이걸 생각 후에 코드를 구현하면 12523401230배 편함.
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
