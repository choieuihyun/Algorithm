package baekjoon_step6;

import java.util.Scanner;

public class Q10809 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		int [] array = new int [26];
		
		
		for(int i = 0; i < array.length; i++) {
			array[i] = -1;
		}
		
		for(int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			
			if(array[ch - 'a'] == -1) {
				array[ch - 'a'] = i;
			}
		}
		
		for(int i : array) {
			System.out.print(i + " ");
		}
		

	}

}
