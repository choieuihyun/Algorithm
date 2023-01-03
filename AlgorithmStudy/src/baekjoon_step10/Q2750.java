package baekjoon_step10;

import java.util.Scanner;

public class Q2750 { // 시간복잡도 O(n^2) 정렬엔 버블, 삽입, 선택정렬이 있다.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int nx = scanner.nextInt();
		int [] x = new int [nx];
		
		for(int i = 0; i < nx; i++) {
			x[i] = scanner.nextInt();
		}
		bubbleSort(x, nx);
		
		for(int j = 0; j < nx; j++) {
			System.out.println(x[j]);
		}

	}
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

//	static void bubbleSort(int[] a , int n) {
//		for(int i = 0; i < n - 1; i++) {
//			for(int j = n - 1; j > i; j--) {
//				if(a[j-1] > a[j])
//					swap(a, j-1, j);
//			}
//		}
//	}
	
	static void bubbleSort(int[] a, int n) { // n이 5라고 가정
		int k = 0;
		while (k < n - 1) { // 4,3,2,1
			int last = n - 1; // last 는 4, 마지막으로 요소를 교환한 위치
			for (int j = n - 1; j > k; j--) { // j가 4,3,2,1
				if(a[j-1] > a[j]) { // a[3] > a[4]면 둘이 바꿈.
					swap(a, j-1, j);
					last = j; // 바꾸고 나면 j-1까지는 정렬이 되어있는거고 j는 정렬이 안되있어서 마지막 부분인 last에 j 대입
				}
			}
			k = last; // 3번째까지 정렬되어있고 한번 정렬해서 4번째까지 정렬 되어있으면 k에 4를 넣어줘서 반복횟수를 줄임. while보면 알음.
		}
	}

}