package baekjoon_step12;

import java.util.Arrays;
import java.util.Scanner;

public class Q7568 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		int array[][] = new int[num][2];
		int result[] = new int[num];
		
		for(int i = 0; i < num; i++) {
			array[i][0] = scanner.nextInt();
			array[i][1] = scanner.nextInt();
		}
		
		Arrays.sort(array, (e1, e2) -> {
			if(e1[0] > e2[0] && e1[1] > e2[1]) {
				result[0]++;
				return e1[0] - e2[0];
			} else {
				return e1[1] - e2[1];
			}
		});
		
		for(int i = 0; i < num; i++) {
			System.out.println(array[i][0] + " " + array[i][1]);
		}
		
		for(int i = 0; i < num; i++) {
			System.out.println(result[i]);
		}

	}

}
