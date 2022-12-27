package baekjoon_step7;

import java.util.Scanner;

public class Q2839 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int a = n / 5;
		int b = a / 3;
		
		if(n % 5 == 0) {
			System.out.print(n/5);
		}
		else if(b > 1) {
			b = a / 3;
			System.out.print(a+b);
		}
		else {
			b = 1;
			System.out.print(a+b);
		}
		

	}

}
