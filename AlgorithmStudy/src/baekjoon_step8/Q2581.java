package baekjoon_step8;

import java.util.Scanner;

public class Q2581 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int M = scanner.nextInt();
		int N = scanner.nextInt();
		
		int sum = 0;
		int min = 10000;
		
		for(int i = M; i < N+1; i++) {
			if(is_Prime(i) == true) {
				sum += i;
				if(i < min) {
					min = i;
				}
			} 
		}
		
		if(sum == 0) {
			System.out.print(-1);
		} else {
			System.out.println(sum);
			System.out.print(min);
		}
	}
	
	static boolean is_Prime(int num) {
		
		if(num < 2)
			return false;
		
		for(int i = 2; i < Math.sqrt(num); i++) { // 제곱근으로하면 합이 달라짐.
			if(num % i == 0)
				return false;
		}
		
		return true;
		
	}

}
