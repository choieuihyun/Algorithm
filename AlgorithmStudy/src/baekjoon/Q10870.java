package baekjoon;

import java.util.Scanner;

public class Q10870 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		
		System.out.print(fibonacci(a));
	}
	
	static int fibonacci(int a) {
		
		if(a == 0)
			return 0;
		
		if(a == 1)
			return 1;
		
		return fibonacci(a-2) + fibonacci(a-1);
		
	}

}
