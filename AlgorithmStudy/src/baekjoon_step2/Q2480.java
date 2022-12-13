package baekjoon_step2;

import java.util.Scanner;

public class Q2480 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int dice1 = scanner.nextInt();
		int dice2 = scanner.nextInt();
		int dice3 = scanner.nextInt();

		
		if(dice1 != dice2 && dice2 != dice3 && dice1 != dice3) {
			
			int max;
			
			if(dice1 > dice2) {
				
				if(dice3 > dice1) {
					
					max = dice3;
					
				} else
					
					max = dice1;
				
			} else {
				
				if(dice2 > dice3) {
					
					max = dice2;
					
				} else
					
					max = dice3;
				
			} 
			System.out.print(max*100);
		} else {
			
			if(dice1 == dice2 && dice2 == dice3) {
				System.out.println(10000 + dice1 * 1000);
			} else {
				if(dice1 == dice2 || dice1 == dice3) {
					System.out.println(1000 + dice1 * 100);
				} else
					System.out.println(1000 + dice2 * 100);
			}
		}
		
	}

}
