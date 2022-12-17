package baekjoon_step6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Q1157 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		String s = scanner.next();
		String upper = s.toUpperCase();
		
		Character [] stringArray = new Character[s.length()];
		int [] array = new int[26];
		
		// 가장 많이 사용된 것을 어떻게 찾을까?
		
		for(int i = 0; i < array.length; i++) {
			array[i] = 0;
		}
		
		for(int i = 0; i < s.length(); i++) {
			char ch = upper.charAt(i);
			array[ch - 'A'] = 1;
			System.out.print(ch + " ");
			
			
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		
		
		
	}

}
