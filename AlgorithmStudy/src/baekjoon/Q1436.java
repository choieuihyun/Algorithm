package baekjoon;

import java.util.Scanner;

public class Q1436 {
	
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int count = 1;
		
		int num = 666;
		
		while(n != count) {
			num++;
	
			if(String.valueOf(num).contains("666"))
				count++;
			
		}
			
		System.out.print(num);
		
		
	} 
	

}
