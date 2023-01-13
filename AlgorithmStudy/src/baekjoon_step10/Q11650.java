package baekjoon_step10;

import java.util.Arrays;
import java.util.Scanner;

public class Q11650 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		int [][] arr = new int [num][2];
		
		for(int i = 0; i < num; i++) {
			arr[i][0] = scanner.nextInt();
			arr[i][1] = scanner.nextInt();
		}
		
		// https://st-lab.tistory.com/110
		// compare 함수를 람다로 재정의한건데 일단, compare 함수를 통해 두 원소 e1, e2의 크기(우선순위)에 따른 값을 반환함.
		// 크게 3가지가 있는데, 선행 원소(e1)가 후행 원소(e2)보다 작다면 음수값을, 서로 같다면 0을, 선행 원소(e1)가 후행 원소보다 크다면 양수를 반환함.
		// 댓글에 자세히 써져있음.
		Arrays.sort(arr, (e1, e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});
		
		for(int i = 0; i < num; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}

}
