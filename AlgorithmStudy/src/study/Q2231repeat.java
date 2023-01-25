package study;

import java.util.Scanner;

public class Q2231repeat {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int result = 0;
		
		for(int i = 0; i < a; i++) {
			
			int sum = 0;
			int number = i; // 이렇게 안하면 21번째 줄에서 i가 나눠진 상태로 내려가니까 if절이 충족이 안됨. if에 number 써도 안뜨는 원리랑 같지 뭐
			
			while(number != 0) {
				sum += number % 10;
				number = number / 10;
			}
			
			if(sum + i == a) {
				result = i;
				break;
			}
			
		}
		
		System.out.print(result);
		
		
		
	}

}
