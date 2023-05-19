package baekjoon;

import java.util.Scanner;

public class Q11720 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		int sum = 0;
		
		String num = scanner.next();
		
		for(int i = 0; i < a; i++) {
			char ch = num.charAt(i);
			int n = Character.getNumericValue(ch);
			sum += n;
		}
		System.out.print(sum);
	}
}
