package baekjoon;

public class Q4973 {

	public static void main(String args[]) {
		
		boolean[] check = new boolean[10001];
		
		for(int i = 1; i < 10001; i++) {
			int n = selfNumber(i);
			
			if(n < 10001)
				check[n] = true;
				
		}
		
		for(int i = 1; i < 10001; i++) {
			if(check[i] == false) { // �迭 ���� 0�� �ƴѰ��� ����ض� �ɵ�.
				System.out.println(i);
			}
		}
	}

	static int selfNumber(int num) {
		
		int sum = num;
		
		while(num != 0) {
			sum = sum + num%10;
			num = num/10;
		}
		
		return sum;
		
	}

}
