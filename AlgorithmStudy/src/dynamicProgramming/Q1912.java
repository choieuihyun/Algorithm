package dynamicProgramming;

import java.util.Scanner;

public class Q1912 {
	
	static Integer [] seqSumMemo; // 기본값을 Null로 두기 위한 객체형 선언.
	static int [] seqSumArray;
	static int max;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		seqSumArray = new int[N];
		seqSumMemo = new Integer [N];
		
		for(int i = 0; i < N; i++) {
			
			seqSumArray[i] = sc.nextInt();
			
		}
		
		seqSumMemo[0] = seqSumArray[0];
		max = seqSumArray[0];
	
		seqSum(N-1);
		
		System.out.print(max);

	}
	
	static int seqSum(int N) {
		
		if(seqSumMemo[N] == null) {
			seqSumMemo[N] = Math.max(seqSum(N-1) + seqSumArray[N], seqSumArray[N]);
			max = Math.max(seqSumMemo[N], max);
		}
		
		return seqSumMemo[N];
		
	}

}
