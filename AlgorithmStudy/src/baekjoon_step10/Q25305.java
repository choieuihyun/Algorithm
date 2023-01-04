package baekjoon_step10;

import java.util.Scanner;

public class Q25305 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int cutLine = scanner.nextInt();
		
		int max = 0;
		int[] scoreArray = new int[num];
		
		for(int i = 0; i < num; i++) {
			int score = scanner.nextInt();
			scoreArray[i] = score;
		}
		
		bubbleSort(scoreArray, num);
		
		System.out.print(scoreArray[num-cutLine]);

	}
	
	static void swap(int [] x, int a, int b) {
		int temp = x[a];
		x[a] = x[b];
		x[b] = temp;
	}
	
	static void bubbleSort(int [] a, int n) {
		int k = 0;
		while(k < n - 1) {
			int last = n - 1;
			for(int i = n - 1; i > k; i--) {
				if(a[i-1] > a[i]) {
					swap(a, i-1, i);
					last = i;
				}
			}
			k = last;
		}
	}

}
