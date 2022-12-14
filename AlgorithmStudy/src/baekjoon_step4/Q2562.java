package baekjoon_step4;

import java.util.Scanner;

public class Q2562 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int [] array = new int[9];
		int max = 0;
		int idx = 0;
		
		for(int i = 0; i < 9; i++) {
			int num = scanner.nextInt();
			array[i] = num;
			if(array[i] > max) {
				max = array[i];	
				idx = i+1;
			}
		}
		System.out.print(max + "\n" + idx);
	}

}
