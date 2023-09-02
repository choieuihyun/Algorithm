package study;

import java.util.Scanner;

public class QueenTest_Q9663 {
	
	public static int[] arr;
	public static int N;
	public static int count = 0;
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		N = in.nextInt();
		arr = new int[N];
 
		nQueen(0);
		System.out.println(count);
 
	}
 
	// [2,0,3,1]�̸� index�� ��, index�� ���� ���̴�.
	public static void nQueen(int depth) {
		// ��� ���Ҹ� �� ä�� ���¸� count ���� �� return 
		// ���� �� ä��� ī��Ʈ�� 1 ������Ű�� ���� 
		if (depth == N) {
			count++;
			return;
		}
 
		for (int i = 0; i < N; i++) {
			arr[depth] = i; // 1. array[0]�� 0�ְ� 
			// ���� �� �ִ� ��ġ�� ��� ���ȣ��
			// �ش� ������ i ��° �࿡ ���� �� �ִ����� �˻��ϴ� �Լ� 
			if (Possibility(depth)) { // 2. Possibility(0)�� boolean �˻��ؼ� true�� nQueen(1) ���� 
				nQueen(depth + 1);
			}
		}
 
	}

	public static boolean Possibility(int col) {
		
		for (int i = 0; i < col; i++) {
			// �ش� ���� ��� i���� ���� ��ġ�Ұ�� (���� �࿡ ������ ���) 
			if (arr[col] == arr[i]) {
				return false;
			} 
			
			/*
			 * �밢���� �����ִ� ���
			 * ���� ���� ���� ���� ���� ��찡 �밢���� �����ִ� ����)
			 */
			else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
				return false;
			}
		}
		
		return true;
	}

}
