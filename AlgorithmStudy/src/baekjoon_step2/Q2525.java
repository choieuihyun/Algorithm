package baekjoon_step2;

import java.util.Scanner;

public class Q2525 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
//		if(hour + ((minute+time)/60) >= 24) {
//			System.out.print(((hour  + (minute + time)/60) % 24) + " " + (minute + time)%60);
//		} else
//			System.out.print((hour + (minute + time)/60) + " " + (minute+time)%60);
		
		int min = 60 * a + b;
		min += c;
		
		int hour = (min/60) % 24;
		int minute = min % 60;
		
		System.out.println(hour + " " + minute);
		

	}

}
