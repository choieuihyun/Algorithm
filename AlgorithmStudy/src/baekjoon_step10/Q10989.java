package baekjoon_step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10989 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		
		int[] array = new int[10001];
		
		for(int i = 0; i < num; i++) {
			array[Integer.parseInt(br.readLine())]++;
		}
		
		br.close();
		
		StringBuilder sBuilder = new StringBuilder();
		
		for(int i = 0; i < array.length; i++) {
			
			while(array[i] > 0) {
				sBuilder.append(i).append('\n');
				array[i]--;
			}
		}
		
		System.out.println(sBuilder);

	}

}
