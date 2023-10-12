package dynamicProgramming;
import java.util.Scanner;

public class Q9461 {
	
	static long [] padovanMemo = new long [101];

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		padovanMemo[0] = 0;
		padovanMemo[1] = 1;
		padovanMemo[2] = 1;
		padovanMemo[3] = 1;
		
		for(int i = 4; i < padovanMemo.length; i++) {
			padovanMemo[i] = -1;
		}
		
		int T = sc.nextInt();

		
		for(int i = 0; i < T; i++) {
			int N = sc.nextInt();
			sb.append(padovan(N)).append("\n");
		}
		
		System.out.print(sb);

	}
	
	static long padovan(int N) {
		
		if(padovanMemo[N] == -1) // Q1904�� �׷��� ���� �ٽ��� �� Ž������ ���� �ε����� ���� �̰Ŷ�� �����Ѵ�.
			padovanMemo[N] = padovan(N-2) + padovan(N-3);
		
		return padovanMemo[N];
	}

}
