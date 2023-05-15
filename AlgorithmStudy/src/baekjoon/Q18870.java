package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Q18870 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int [] array = new int [N];
		int [] compArray = new int [N];
		HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < N; i++) {
			array[i] = compArray[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(compArray);
		
		int rank = 0;
		
		for(int v : compArray) {
			if(!rankingMap.containsKey(v)) {
				rankingMap.put(v, rank);
				rank++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int key : array) {
			int ranking = rankingMap.get(key);
			sb.append(ranking).append(' ');
		}
		
		System.out.println(sb);

	}

}

//      이건 시간초과요. 시간초과 터질거 아는데 걍 해봤어요.
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
//
//		int N = Integer.parseInt(br.readLine());
//	
//		int [] array = new int [N];
//		int [] compArray = new int [N];
//
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//		for(int i = 0; i < N; i++) {
//			array[i] = Integer.parseInt(st.nextToken());
//		}
//
//		for(int i = 0; i < N; i++) {
//	
//			int count = 0;
//	
//			for(int j = 0; j < N; j++) {
//				if(array[i] > array[j]) {
//					count++;
//				}
//			}
//			compArray[i] = count;
//		}
//
//		for(int i = 0; i < N; i++) {
//			System.out.print(compArray[i]);
//		}
//
//		}

