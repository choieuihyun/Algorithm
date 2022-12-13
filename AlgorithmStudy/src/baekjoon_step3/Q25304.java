package baekjoon_step3;

import java.util.Scanner;

public class Q25304 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int totalPrice = scanner.nextInt();
		int totalNum = scanner.nextInt();
		int sum = 0;
		
		for(int i = 0; i < totalNum; i++) {
			int price = scanner.nextInt();
			int num = scanner.nextInt();
			
			sum =+ sum + (price*num);

		}
		
		if(sum == totalPrice)
			System.out.print("Yes");
		else
			System.out.print("No");

	}

}
