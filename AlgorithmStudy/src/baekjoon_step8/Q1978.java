package baekjoon_step8;

import java.util.Scanner;

public class Q1978 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int count = 0;
		
		for(int i = 0; i < num; i++) {
			int prime = scanner.nextInt();
			if(is_Prime(prime) == true)
				count++;
		}
		
		System.out.print(count);
	}
	
	
	static boolean is_Prime(int num) {
		
		if(num == 1)
			return false;
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0)
				return false;
		}
			
		
		return true;
	}

}
