package stack;

import java.util.Scanner;
import java.util.Stack;

public class Q4949 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		while(true) {
			
			String s = scanner.nextLine();

			if(s.equals("."))
				break;
			
			System.out.println(stack(s));
			
		}
		
	}
	
	static String stack(String s) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int index = 0; index < s.length(); index++) {
			
			char c = s.charAt(index);
			
			if (c == '(' || c == '[') {
				stack.push(c);
			}
			
			else if (c == ')') {
				
				if (stack.empty() || stack.peek() != '(') {
					return "no";
				} else
					stack.pop();
				
			}
			
			else if (c == ']') {
				
				if (stack.empty() || stack.peek() != '[') {
					return "no";
				} else
					stack.pop();
				
			}
			
		}
		
		if (stack.empty())
			return "yes";
		else
			return "no";
		
		//System.out.print(stack);
		
	}

}
