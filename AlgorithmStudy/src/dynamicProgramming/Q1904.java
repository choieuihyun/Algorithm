package dynamicProgramming;

import java.util.Scanner;

public class Q1904 {
	
	// �� ���� ��Ŭ�������� ���� ����� �ִ� 1024kb�� �⺻������ �����س��� �״�� �ϸ� ���� �����÷ο� ���� ��.
	// �׷��� ���� �ӽ÷� ���û���� �÷���.
	
	static int binaryMemo [] = new int [1000001];

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		binaryMemo[0] = 0; // �� �κ��� �� ȥ�� �Ҷ��� binary �޼��� �ȿ� �׾��µ� ���� �׷� �ʿ� ����.
		binaryMemo[1] = 1; // ���� �������� �κ��� ��Ϳ� �־ �ݺ��ϴ� �޸� ������.
		binaryMemo[2] = 2;
		
		for(int i = 3; i < binaryMemo.length; i++) {
			binaryMemo[i] = -1; // �̰� ���� ���߾��µ� �޸������̼ǿ� int�� �迭�� �⺻�� 0���� ����Ǿ� ������
								// �װ� ����ִٴ� ���� ���� �ʱ� ������ �ƿ� ���� �� ���� ������ �ʱ�ȭ�ص�.
								// Ư�� �� ���������� % 15746�� �����ϱ� ������ ������ ���� 0�� ������ ��쵵 �ֱ⿡ ������ �ʱ�ȭ �ؾ���.
								// ���� ��� 0�� ���·� �ΰ� 0�� ���� �������� ������ �� ������ ���� 0�̸� ��� �����ݾ�.
		}
		
		System.out.print(binary(a));
		

	}
	
	static int binary(int a) {
		
		if(binaryMemo[a] == -1) {
			binaryMemo[a] = (binary(a-1) + binary(a-2)) % 15746;
		}
		
		return binaryMemo[a];
		
	}

}
