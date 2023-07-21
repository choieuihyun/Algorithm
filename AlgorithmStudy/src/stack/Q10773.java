package stack;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10773 {
	
	static ArrayList<Integer> array = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			
			int value = scanner.nextInt();
			
			push(value);
			
		}
		
		for(int i = 0; i < array.size(); i++) {
			
			sum += array.get(i);
			
		}
		System.out.print(sum);
		
	
	}
	
	static void push(int value) {
		
		if(value != 0)
			array.add(value);
		else
			array.remove(array.size()-1);
		
	}

	
	

}
