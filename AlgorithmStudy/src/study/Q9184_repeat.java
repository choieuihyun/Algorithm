package study;

import java.util.Scanner;

public class Q9184_repeat {
	
	static int [][][] wMemo = new int [21][21][21]; // �ƴ� �̰� ��������ϱ� �׳� �Ƿº����ϱ� a,b,c ������ ������ ������ ����ϴ°ǵ� ���嵵 3���� �ؾ���
													// �׷��� 3���� �迭 �����.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if ( a == -1 && b == -1 && c == -1) {
				break;
			}
			
			System.out.println(w(a,b,c));
			
		}

	}
	
	static int w(int a, int b, int c) {
		
		if (0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20 && wMemo[a][b][c] != 0) { // �ִ� ������ ������ �ֱ⿡ �����.
			return wMemo[a][b][c];
		}
		
		if ( a <= 0 || b <= 0 || c <= 0 ) { // baseCondition
			return 1;
		}
		
		else if ( a > 20 || b > 20 || c > 20 ) { // baseCondition
			return wMemo[20][20][20] = w(20, 20, 20);
		}
		
		else if ( a < b && b < c ) {
			return wMemo[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
		}
		
		
		return wMemo[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
		
	}

}
