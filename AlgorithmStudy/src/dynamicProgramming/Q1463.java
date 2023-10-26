package dynamicProgramming;
import java.util.Scanner;

public class Q1463 {
	
	static Integer [] dp;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		dp = new Integer[X+1];
		
		dp[0] = 0; // top-down 방식이라 초깃값은 필요하고 생각해보면 넣어놓는게 맞음.
		dp[1] = 0;
		
		System.out.println(find(X));
		
		
	}
	
	static int find(int X) {
		
		// 계속 까먹는데 나는 이 안에 로직을 넣을려고 함.
		// 결국 입으로 코딩하는걸 그대로 구현하는 것 뿐이야.
		// 논리 자체만 넣어두고 계산은 컴퓨터가 한다고.
		if(dp[X] == null) {
			
			if(X % 6 == 0) { // 6일때는 2와 3 둘중에 하나일 때의 최솟값과 1을 뺐을 때의 최솟값 비교.
				
				dp[X] = Math.min(Math.min(find(X/3), find(X/2)), find(X-1)) + 1;
				
			}
			
			else if(X % 3 == 0) { // 3으로 나눴을 때랑 1 뺐을 때를 비교. 이런식으로 나가는거임 조건 그대로.
				
				dp[X] = Math.min(find(X/3), find(X-1)) + 1;

			}
			
			else if(X % 2 == 0) {
				
				dp[X] = Math.min(find(X-1), find(X/2)) + 1;
				
			}
			
			else {
				
				dp[X] = find(X-1) + 1;

			}
			
		}
		
		return dp[X];
		
	}


}
