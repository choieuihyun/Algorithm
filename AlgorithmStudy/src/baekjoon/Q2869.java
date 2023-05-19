package baekjoon;

import java.util.Scanner;

public class Q2869 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int v = scanner.nextInt();
		
		int x = (v-a)/(a-b);
		
		if((v-a) % (a-b) != 0) {
			x++;
		}
		
		System.out.print(x+1);
	}

}
