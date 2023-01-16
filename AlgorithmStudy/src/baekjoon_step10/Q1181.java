package baekjoon_step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Q1181 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		StringBuilder stringBuilder = new StringBuilder();
		
		String [] array = new String [num];
		
		for(int i = 0; i < num; i++) {
			array[i] = br.readLine();
		}
		
		Arrays.sort(array, new Comparator<String>() {
			
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				else {
					return s1.length() - s2.length();
				}
			}
			
		});
		
		stringBuilder.append(array[0]).append('\n');
		
		for(int i = 1; i < num; i++) {
			if(!array[i].equals(array[i-1])) { // equals로 안해주면 똑같은거 그대로 출력
				stringBuilder.append(array[i]).append('\n');
			}
		}

		System.out.print(stringBuilder);
		
	}
	
	



}
