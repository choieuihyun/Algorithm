package baekjoon_step10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q2751 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int num = scanner.nextInt();

		ArrayList<Integer> list = new ArrayList<>();
		
		if(num >= 1 && num <= 1000000) {
		
			for (int i = 0; i < num; i++) {
				list.add(scanner.nextInt());
			}
			
			Collections.sort(list);
			
			for(int value : list) {
				sb.append(value).append('\n');
			}
			
			System.out.print(sb);
		}
		

	}

}
