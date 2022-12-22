 package baekjoon_step6;

import java.util.Scanner;

public class Q2941 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.next();
		
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if(ch == 'c') {
				
				if(i < s.length()-1) {
					
					if(s.charAt(i+1) == '=' || s.charAt(i+1) == '-') {
						count--;
					}
				}
				
			} else if(ch == 'd') {
				
				if(i < s.length()-1) {
					
					if(s.charAt(i+1) == 'z') {
						
						if(i < s.length()-2) {
						
						if(s.charAt(i+2) == '=') {
							count--;
						}
					}
				}
				
				if(s.charAt(i+1) == '-') {
					count--;
				}
			}
			} else if(ch == 'j') {
				
				if(i > 0) {
				
					if(s.charAt(i-1) == 'l' || s.charAt(i-1) == 'n') {
						count--;
					}
			}
				
			} else if(ch == 's' || ch == 'z') {
				if(i < s.length()-1) {
				
				if(s.charAt(i+1) == '=') {
					count--;
				}
				}
			} 
				count++;
			
			
			
		}
		
		System.out.print(count);
		
		
	}

}


