package dynamicProgramming;

import java.util.Scanner;

public class Q9184 {
	
	static int [][][] wMemo;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		wMemo = new int [21][21][21];
		
		while(true) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			
			if(a == -1 && b == -1 && c == -1) {
				break;
			}
			
			System.out.println(w(a,b,c));
			
		}
		
	}
	
	
	// 내 생각 주석 
	static int w(int a ,int b, int c) {
		
		// 이거 안하면 boundOut 에러 뜸. 50 넣었을 경우 탐색의 범위가 배열보다 커져버려서 뜸.
		if(inRange(a,b,c) && wMemo[a][b][c] != 0) {
			return wMemo[a][b][c];
		}
		
		// 동적 계획법은 결국 분할정복에서 중복되는 부분을 다시 계산 안할뿐이고 최솟값과 최댓값의 범위는 정해져있음.
		// 이 부분과 바로 아래 부분의 if가 최소 최대값인데 어떻게 보면 당연하다고 본다.
		// 결국 범위 내에서 탐색하는거니까. 탐색 범위에서 최소와 최대에는 조건에 따라서 값을 넣어놓을 수 있겠지.
		if(a <= 0 || b <= 0 || c <= 0) {

			return 1;
			
		}
		
		// 여기가 범위 내에서의 최댓값.
		if (a > 20 || b > 20 || c > 20) {
			
			return wMemo[20][20][20] = w(20, 20, 20);
			
		}
		
		// 결국 중요한건 이 부분과 아래의 return 부분이겠지.
		// 이번껀 그냥 재귀로 짠 부분에 메모이제이션만 사용한거라 쉬웠는데 이 기본 원리를 아는게 중요하지 않을까? 
		if (a < b && b < c) {
			
			return wMemo[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
			
		} 
		
			return wMemo[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
			
	}
	
	// 처음에 이렇게 안하고 구현 부분을 그대로 조건에 썼다가 코드 드러워서 인터넷 보고 다시 긁어옴 ㅎㅎ;
	static boolean inRange(int a, int b, int c) {
		return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20; 
	}

}
