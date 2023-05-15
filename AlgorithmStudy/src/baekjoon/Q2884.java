package baekjoon;

import java.util.Scanner;

public class Q2884 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int hour = scanner.nextInt();
		int minute = scanner.nextInt();
		
		if(minute >= 45) {
			System.out.print(hour + " " + (minute-45));
		} else if (minute < 45) {
			if(hour == 0) 
				System.out.print(23 + " " + (minute+15));
			else
				System.out.print((hour-1) + " "  + (minute + 15));
		}

	}

}
