package baekjoon_step7;

import java.util.Scanner;

public class Q10250 { // ¿Ö Ä¿¹ÔÀÌ ¾ÈµÇÂ¡

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int A = 0;
		int B = 0;
		
		for(int i = 0; i < num; i++) {
			
			int h = scanner.nextInt();
			int w = scanner.nextInt();
			int n = scanner.nextInt();
			
			
			if(n % h != 0) {
				A = (n % h) * 100; // »ç¶÷ÀÌ µé¾î°£ Ãş
			} else {
				A = h * 100;
			}
				
			
			
			if(n % h != 0)
				B = n / h + 1;
			else
				B = n / h;
		}
		
		
		int AABB = A+B;
		
		System.out.print(AABB);
		
		
	}
}


