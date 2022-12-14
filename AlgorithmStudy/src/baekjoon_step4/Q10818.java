package baekjoon_step4;

import java.util.Scanner;

public class Q10818 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		int [] array = new int[size];
		int max = -1000000;
		int min = 1000000;
		
		for(int i = 0; i < size; i++) {
			int num = scanner.nextInt();
			array[i] = num;
			if(array[i] < min)
				min = array[i];
			if(array[i] > max)
				max = array[i];
		}
		System.out.print(min + " " + max);
	}

}
