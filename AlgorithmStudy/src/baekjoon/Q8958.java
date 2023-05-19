package baekjoon;

import java.util.Scanner;

public class Q8958 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String [] stringArray = new String[scanner.nextInt()];
		
		for(int i = 0; i < stringArray.length; i++) {
			stringArray[i] = scanner.next();
		}
		
		scanner.close();
		
		for(int i = 0; i < stringArray.length; i++) {
			int count = 0;
			int sum = 0;
			
			for(int j = 0; j < stringArray[i].length(); j++) {
				if(stringArray[i].charAt(j) == 'O') {
					count++;
				} else {
					count = 0;
				}
				sum += count;
			}
			System.out.println(sum);
		}
	}
}

