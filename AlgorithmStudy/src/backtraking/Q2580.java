package backtraking;

import java.util.Scanner;

public class Q2580 {
	
	static StringBuilder sb = new StringBuilder();
	static Scanner sc = new Scanner(System.in);
	static int [][] array = new int[9][9];

	public static void main(String[] args) {
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		
		

	}
	
	static void sudoku(int row, int col) {
		
		if (col == 9) {
			sudoku(row + 1, 0);
			return; // �� return�� ������ �� ������ �򰥸���. return�� ���� ���Ǹ� ��Ȯ�� �����ؾ��Ѵ�. 
		}
		
		if (row == 9) {
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					sb.append(array[i][j]).append(' ');
				}
				sb.append('\n');
			}
			System.out.print(sb);
		}
		
		if(array[row][col] == 0) { 
			for(int i = 1; i <= 9; i++) {
				if (posibility(row, col, i)) { // true�� ������ ���̰� 
					array[row][col] = i;
					sudoku(row, col + 1);
				}
			}
			
			array[row][col] = 0; 
			return; 
		}
		
		sudoku(row, col + 1);
		
	}
	
	static boolean posibility(int row, int col, int value) {
		
		for(int index = 0; index < 9; index++) {
			
			if(array[row][index] == value) {
				return false;
			}
			
			if(array[index][col] == value) {
				return false;
			}
			
		}
		
		// ù��° Ž���� row : 0 ~ 2, col : 0 ~ 2�ε� 
		// �ι�°�� row : 0 ~ 2, col : 3 ~ 5
		
		int cal_row = (row / 3) * 3;
		int cal_col = (col / 3) * 3;
		
		for(int i = cal_row; i < cal_row+3; i++) {
			
			for(int j = 0; j < cal_col; j++) {
				
				if(array[i][j] == value)
					return false;
				
			}
			
		}
		
		
		return true;
		
	}

}
