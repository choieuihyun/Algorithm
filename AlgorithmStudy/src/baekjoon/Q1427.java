package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Q1427 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		char[] array = scanner.next().toCharArray();
		
		Arrays.sort(array);

		for(int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]);
		}

	}

}
