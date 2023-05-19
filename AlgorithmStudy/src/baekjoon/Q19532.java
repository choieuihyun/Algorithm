package baekjoon;

import java.util.Scanner;

public class Q19532 {

	public static void main(String[] args) {
		
			
			Scanner scanner = new Scanner(System.in);

			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			int d = scanner.nextInt();
			int e = scanner.nextInt();
			int f = scanner.nextInt();
			
			int resultX = 0;
			int resultY = 0;
			
			for(int x = -999; x <= 999; x++) {
				
				for(int y = -999; y <= 999; y++) {
					
					if((a * x) + (b * y) == c && (d * x) + (e * y) == f) {
						resultX = x;
						resultY = y;
					}
						
					
				}
				
			}
			System.out.print(resultX + " " + resultY);
			
	

	}

}
