package stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;


public class Q9012 {
	
	static ArrayList<String> stack = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		for(int index = 0; index < N; index++) {
			
			String s = scanner.next();
			
			String vps = vps(s);
			
			System.out.println(vps);
			
		}
		
		
	}
	
	static String vps(String s) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int index = 0; index < s.length(); index++) {
			
			char c = s.charAt(index);
			
			if(c == '(')
				stack.push(c);
			
			else if(stack.empty())
				return "NO";
			
			else
				stack.pop();
			
		}
		
		if(stack.empty())
			return "YES";
		else
			return "NO";
		
		
	}		
		

}
