package baekjoon_step4;

import java.util.Scanner;

public class Q10807 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		int count = 0;
		int [] array = new int[size];
		
		for(int i = 0; i < array.length; i++) {
			int num = scanner.nextInt();
			array[i] = num;
		}
		
		int key = scanner.nextInt();
		
		for(int j = 0; j < array.length; j++) {

			if(array[j] == key) {
				count++;
			}
		}
		
		
		System.out.print(count);

	}

}
