package baekjoon;

import java.util.Scanner;

public class Q10250 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();

		for(int i = 0; i < num; i++) {
			
			int h = scanner.nextInt(); // �� ��
			int w = scanner.nextInt(); // ȣ ��
			int n = scanner.nextInt(); // n��° �մ�
			
			if(n % h != 0) {
				System.out.println(((n%h) * 100) + ((n/h) + 1));
			} else {
				System.out.println((h*100) + (n/h));
			}
					
		}
		
	}
}


