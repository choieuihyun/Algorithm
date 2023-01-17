package baekjoon_step10;

import java.util.Arrays;
import java.util.Scanner;

public class Q10814 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		String [][] array = new String [num][2];
		
		for(int i = 0; i < num; i++) {
			array[i][0] = scanner.next();
			array[i][1] = scanner.next();
		}
		
		Arrays.sort(array, (String [] e1, String [] e2) -> {
			return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]);
		});


		for(int i = 0; i < num; i++) {
			System.out.println(array[i][0] + " " + array[i][1]);
		}
		
	}	
	
	

}
