package baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1152 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.nextLine();
		
		StringTokenizer stringTokenizer = new StringTokenizer(s, " ");
		
		System.out.print(stringTokenizer.countTokens());
	}

}
