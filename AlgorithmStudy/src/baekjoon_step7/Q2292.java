package baekjoon_step7;

import java.util.Scanner;

public class Q2292 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int count = 1;
		int range = 2;
		
		if(n == 1)
			System.out.println(1);
		else {
			while(n >= range) {
			range = range + (count*6);
			count++;
			}
			System.out.print(count);
		}
		
		
		
	}
	

	
}