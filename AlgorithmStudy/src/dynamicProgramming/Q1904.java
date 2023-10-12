package dynamicProgramming;

import java.util.Scanner;

public class Q1904 {
	
	// 이 문제 이클립스에서 스택 사이즈를 최대 1024kb로 기본값으로 설정해놔서 그대로 하면 스택 오버플로우 에러 뜸.
	// 그래서 내가 임시로 스택사이즈를 늘려줌.
	
	static int binaryMemo [] = new int [1000001];

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		binaryMemo[0] = 0; // 이 부분을 나 혼자 할때는 binary 메서드 안에 뒀었는데 굳이 그럴 필요 없지.
		binaryMemo[1] = 1; // 괜히 쓸데없는 부분을 재귀에 넣어서 반복하는 메모리 낭비였음.
		binaryMemo[2] = 2;
		
		for(int i = 3; i < binaryMemo.length; i++) {
			binaryMemo[i] = -1; // 이걸 생각 못했었는데 메모이제이션에 int형 배열의 기본인 0으로 저장되어 있으면
								// 그게 비어있다는 뜻이 되지 않기 때문에 아예 나올 수 없는 음수로 초기화해둠.
								// 특히 이 문제에서는 % 15746을 수행하기 때문에 나머지 값이 0이 나오는 경우도 있기에 더더욱 초기화 해야함.
								// 예를 들면 0인 상태로 두고 0일 때를 조건으로 돌렸을 때 나머지 값이 0이면 계속 돌리잖아.
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
