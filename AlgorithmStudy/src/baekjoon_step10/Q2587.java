package baekjoon_step10;

import java.util.Scanner;

public class Q2587 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] a = new int[5];
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			a[i] = scanner.nextInt();
		}
		
		bubbleSort(a);
		
		for(int i = 0; i < 5; i++) {
			sum += a[i];
		}
		
		System.out.println(sum/5);
		
		System.out.print(a[a.length/2]);

	}
	
	static void swap(int[] z, int x, int y) {
		int temp = z[x];
		z[x] = z[y];
		z[y] = temp;
	}
	
	static void bubbleSort(int [] n) {
		int k = 0;
		while(k < 4) {
			int last = 4;
			for(int i = 4; i > k; i--) {
				if(n[i-1] > n[i]) {
					swap(n, i-1, i);
					last = i;
				}
			}
			k = last;
		}
	}

}
