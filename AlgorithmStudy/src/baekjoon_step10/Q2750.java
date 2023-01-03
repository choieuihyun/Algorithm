package baekjoon_step10;

import java.util.Scanner;

public class Q2750 { // �ð����⵵ O(n^2) ���Ŀ� ����, ����, ���������� �ִ�.

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
	
	static void bubbleSort(int[] a, int n) { // n�� 5��� ����
		int k = 0;
		while (k < n - 1) { // 4,3,2,1
			int last = n - 1; // last �� 4, ���������� ��Ҹ� ��ȯ�� ��ġ
			for (int j = n - 1; j > k; j--) { // j�� 4,3,2,1
				if(a[j-1] > a[j]) { // a[3] > a[4]�� ���� �ٲ�.
					swap(a, j-1, j);
					last = j; // �ٲٰ� ���� j-1������ ������ �Ǿ��ִ°Ű� j�� ������ �ȵ��־ ������ �κ��� last�� j ����
				}
			}
			k = last; // 3��°���� ���ĵǾ��ְ� �ѹ� �����ؼ� 4��°���� ���� �Ǿ������� k�� 4�� �־��༭ �ݺ�Ƚ���� ����. while���� ����.
		}
	}

}