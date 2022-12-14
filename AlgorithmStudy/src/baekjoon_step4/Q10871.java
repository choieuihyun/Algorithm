package baekjoon_step4;

import java.util.Scanner;

public class Q10871 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		int key = scanner.nextInt();
		
		int [] array = new int[size];
		
		for(int i = 0; i < size; i++) {
			int num = scanner.nextInt();
			array[i] = num;

		}
		
		for(int i = 0; i < size; i++) {
			if(array[i] < key) {
				System.out.print(array[i] + " ");
			}
		}

	}

}
