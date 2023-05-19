package baekjoon;


import java.util.Scanner;

public class Q5597 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int [] stdArray = new int[31];

		for(int i = 1; i < 29; i++) {
			int std = scanner.nextInt();
			stdArray[std] = 1;
		}
		
		for(int i = 1; i < stdArray.length; i++) {
			if(stdArray[i] != 1) {
				System.out.println(i);
			}
		}
		

	}

}
