package baekjoon_step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Year;
import java.util.Scanner;

import javax.security.auth.x500.X500Principal;

public class Q2447 {
	
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		
		
		//recur(N);
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				recur(N,i,j);
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
	
	static void recur(int N, int i, int j) {
		
		if(i < 3 && j < 3) {
			if(i % 3 == 1 && j % 3 == 1) {
				sb.append(" ");
			} else {
				sb.append("*");
			}
		} else {
			if(i % 3 == 1 && j % 3 == 1) {
				sb.append(" ");
			} else {
				recur(N, i/3, j/3);
			}
		}
		
//		if(N % 3 == 0) {
//			
//			if((i / 3) % 3 == 1 && (j / 3) % 3 == 1)
//				
//				sb.append(" ");
//			
//			else if (i % 3 == 1 && j % 3 == 1) 
//				
//				sb.append(" ");
//			
//			else
//				
//				sb.append("*");
//			
//			
//			 
//		}


		
	}

}
