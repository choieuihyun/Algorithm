package baekjoon_step4;

import java.util.Arrays;
import java.util.Scanner;

public class Q3052 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] array = new int[10];
		int count = 1;
		
		for(int i = 0; i < 10; i++) {
			int num = scanner.nextInt();
			array[i] = num % 42;
		}
		
		Arrays.sort(array);
		
		for(int i = 1; i < array.length; i++) {
			if(array[i-1] != array[i])
				count++;
		}
		
		System.out.print(count);

	}

}
