package baekjoon_step8;

import java.util.Scanner;

public class Q1929 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int M = scanner.nextInt();
		int N = scanner.nextInt();
		
		for(int i = M; i <= N; i++) { // 소수인지 넣어보기
			make_prime(i);
		}

	}
	
	static void make_prime(int number) {
		
		
		if(number < 2) {
			return;
		}
		
		if(number == 2) {
			System.out.println(number);
			return;
		}
		
		for(int i = 2; i <= Math.sqrt(number); i++) { // 소수 구하기
			if(number % i == 0) {
				return;
			}
		}
		
		System.out.println(number);
		return;

	}

}
