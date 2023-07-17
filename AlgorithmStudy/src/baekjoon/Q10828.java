package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q10828 {
	
	static ArrayList<Integer> array = new ArrayList<Integer>();
	
	public static void main(String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		
		int num = Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i < num; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			
			switch(st.nextToken()) {
			
				case "push": 
					int a = Integer.parseInt(st.nextToken());
					array.add(a);

					break;
				
				
				case "pop": 
					if(array.size() == 0) {
						sb.append(-1).append('\n');
					}
					else {
						sb.append(array.remove(array.size() -1)).append('\n');
					}
						
					break;	
				
				case "size": 
					sb.append(array.size()).append('\n');
					break;
				
				
				case "empty": 
					if(array.isEmpty() == true)
						sb.append(1).append('\n');
					else
						sb.append(0).append('\n');
					
					break;
						
				
				case "top": 
					if(array.size() == 0)
						sb.append(-1).append('\n');
					else
						sb.append(array.get(array.size()-1)).append('\n');
					break;
							 	
			}
		}
		System.out.println(sb.toString());
	}

}
