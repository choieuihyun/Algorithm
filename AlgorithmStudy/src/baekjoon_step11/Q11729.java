package baekjoon_step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11729 {
	
	static StringBuilder sBuilder = new StringBuilder();

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		sBuilder.append((int)Math.pow(2, n) -1).append("\n");
		
		hanoi(n, 1, 2, 3);
		
		System.out.print(sBuilder.toString());

	}
	
	static void hanoi(int n, int start, int mid, int to) {
		

		
		if(n == 1) {
			sBuilder.append(start + " " + to + "\n");
			
			return;
		}
		
		hanoi(n-1, start, to, mid);
		
		sBuilder.append(start + " " + to + "\n");
		
		hanoi(n-1, mid, start, to);
		
	
	}

}
