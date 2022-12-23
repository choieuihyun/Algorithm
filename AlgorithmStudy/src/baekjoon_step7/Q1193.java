package baekjoon_step7;

import java.util.Scanner;

public class Q1193 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int cross_count = 1;
		int prev_count_sum = 0;
		
		while(true) {
			
			if(n <= cross_count + prev_count_sum) {
				
				if(cross_count % 2 == 1) {
					System.out.print((cross_count - (n-prev_count_sum-1)) + "/" + (n-prev_count_sum));
					break;
				} else {
					System.out.print((n-prev_count_sum) + "/" + (cross_count - (n-prev_count_sum-1)));
					break;
				}	
				
			}
			
			prev_count_sum += cross_count;
			cross_count++;
			
		}
		
	}

}
