package baekjoon;

import java.util.Scanner;

public class Q10872 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		System.out.print(recur(a));
		
	}
	
	static int recur(int a) {
		
		if(a == 1)
			return 1;
		
		if(a == 0)
			return 1;
		
		return a * recur(a-1);
		
		
	}
	

}
