package study;

import java.util.ArrayList;
import java.util.Scanner;

public class Stack {
	
	static ArrayList<Integer> stack = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = scanner.nextInt();
		
		for(int i=0; i<N; i++) {
			
			String s = scanner.next();
			
			switch(s) {
			
				case "push" : push(scanner.nextInt()); break;
				
				case "pop" : sb.append(pop()).append('\n'); break;
				
				case "size" : sb.append(size()).append('\n'); break;
				
				case "top" : sb.append(top()).append('\n'); break;
				
				case "empty" : sb.append(empty()).append('\n'); break;
				
			
			}
			
			
		}
		
		System.out.println(sb);
	}
	
	static void push(int a) {
		
		stack.add(a);
		
	}
	
	static int pop() {
		
		if(stack.size() != 0) {
			int res = stack.get(stack.size() - 1);
			stack.remove(stack.size() - 1);
			return res;
		}
		else
			return -1;
		
	}
	
	static int size() {
		
		return stack.size();
		
	}
	
	static int top() {
		
		int end = stack.size();
		
		if(stack.size() == 0)
			return -1;
		else
			return stack.get(end - 1);
		
	}
	
	static int empty() {
		
		if (stack.isEmpty())
			return 1;
		else
			return 0;
		
	}
	
	
	
	

}
