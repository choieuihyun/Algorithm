package baekjoon;

import java.util.Scanner;

public class Q10250 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();

		for(int i = 0; i < num; i++) {
			
			int h = scanner.nextInt(); // Ãþ ¼ö
			int w = scanner.nextInt(); // È£ ¼ö
			int n = scanner.nextInt(); // n¹øÂ° ¼Õ´Ô
			
			if(n % h != 0) {
				System.out.println(((n%h) * 100) + ((n/h) + 1));
			} else {
				System.out.println((h*100) + (n/h));
			}
					
		}
		
	}
}


