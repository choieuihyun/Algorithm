package baekjoon;

import java.util.Scanner;

public class Q1157 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		String s = scanner.next();
		String upper = s.toUpperCase();
		String maxString = "";
		
		String [] stringArray = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"
				, "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		int [] array = new int[26];
		
		
		for(int i = 0; i < s.length(); i++) {
			char ch = upper.charAt(i);
			array[ch - 'A'] += 1;
		
		}
		
		int max = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			if(max == array[i]) {
				
				maxString = "?";
				
			} else if (array[i] > max) {
				
				max = array[i];
				maxString = stringArray[i];
				
			}


		}
		
		System.out.print(maxString);
		
	}

}
