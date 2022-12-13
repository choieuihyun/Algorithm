package baekjoon_step3;

import java.util.Scanner;

public class Q11022 {

	public static void main(String[] args)  {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		for(int i = 1; i < num+1; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a+b));
		}
		
	}

}
