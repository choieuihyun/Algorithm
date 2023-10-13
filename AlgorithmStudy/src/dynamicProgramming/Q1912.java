package dynamicProgramming;

import java.util.Scanner;

public class Q1912 {
	
	static Integer [] seqSumMemo; // 기본값을 Null로 두기 위한 객체형 선
	static int [] seqSumArray;
	static int max;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		seqSumArray = new int [N];
		seqSumMemo = new Integer [N];
		
		for(int i = 0; i < N; i++) {
			
			seqSumArray[i] = sc.nextInt();
			
		}
		
		seqSumMemo[0] = seqSumArray[0];
		max = seqSumArray[0];
		
		
		seqSum(N-1);

	}
	
	static int seqSum(int N) {
		
		
		if(seqSumMemo[N] == null) {
			
			// memo에 전 memo값과 현 array값을 더한 값과 현 array값을 비교해서 더 큰 값을 넣음.
			seqSumMemo[N] = Math.max(seqSum(N-1) + seqSumArray[N], seqSumArray[N]);
			
			max = Math.max(seqSumMemo[N], max);
			
			
		}
		
		return seqSumMemo[N];
		
	}

}
