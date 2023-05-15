package baekjoon;

import java.util.Scanner;

public class Q1316 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		int count = size;
		
		for(int i = 0; i < size; i++) {
			String st = scanner.next();
			
			boolean [] check = new boolean[26];
			
			for(int j = 0; j < st.length()-1; j++) {
				
				if(st.charAt(j) != st.charAt(j+1)) {
					if(check[st.charAt(j+1) - 'a'] == true) {
						count--;
						break;
					}
				}		
				check[st.charAt(j) - 'a'] = true;
			}
			
		}
		System.out.print(count);
	}
	

}
