package baekjoon_step6;

import java.util.Scanner;

public class Q2675 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		for(int i = 0; i < a; i++) {
			int b = scanner.nextInt();
			String s = scanner.next();
			for(int j = 0; j < s.length(); j++) {
				for(int k = 0; k < b; k++) {
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
