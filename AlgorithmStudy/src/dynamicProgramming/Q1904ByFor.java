package dynamicProgramming;

import java.util.Scanner;

public class Q1904ByFor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.print(binary(n));
		

	}
	
	static int binary(int n) {
		
		// baseCondition�� �׻� �����ؾ���.
		if(n == 0) 
			return 0;
		
		if(n == 1)
			return 1;
		
		if(n == 2)
			return 2;
	
		// �ٲ� �� ���� ���� 
		// 1 2 3 5 8 13 21 34 �̷��� ���� ������ ���� �ʿ��Ѱ� ����?
		// �ΰ��� ��, ���� ���� ���� ���� ����, ���� ���� ������ ����.
		// �̰� ���� �Ŀ� �ڵ带 �����ϸ� 12523401230�� ����.
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
