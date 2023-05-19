package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q2108 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		float sum = 0;
		float avg = 0; // ���
		int center = 10000; // �߾Ӱ�
		int frequency = 0; // �ֺ�
		int range = 0; // ����
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		ArrayList<Integer> list = new ArrayList<>();
		int [] array = new int[8001];
		
		for(int i = 0; i < num; i++) {
			int a = Integer.parseInt(br.readLine());
			list.add(a);
			
			if(a < 0)
				array[4000-(a)]++;
			else
				array[a]++;
		}
		
		Collections.sort(list);
		
		for(int value : list) {

			if(value > max)
				max = value;
			
			if(value < min)
				min = value;
			
			sum += value;
			avg = sum/list.size();
			center = list.get(num/2);
			range = max-min;
		}
		
		int frequency_max = -10000; 	// �ֺ��� �ִ�  
		
		// ������ ������ �ֺ��� 1���� ����������� true, �ƴҰ�� false
		boolean flag = false;	 
		
		for(int i = 0; i < array.length; i++) {
			
//			if(array[i] > frequency) {
//				frequency = i;
//			}
			
			if(frequency_max < array[i]) {
				frequency_max = array[i];
				frequency = i;
				flag = true;
			}
				
			else if(frequency_max < array[i] && flag == true) {
				frequency = i;					
				flag = false;
			}
				
			
		}
		
		
		System.out.println((int)Math.round((double)(avg)));
		System.out.println(center);
		
		if(frequency > 4000) 
			System.out.println((frequency - 4000) * -1);
		else
			System.out.println(frequency);

		System.out.println(range);
	}
	
//	7 ���ݵ����� ÷���մϴ�!!
//	1
//	2
//	8
//	-88
//	-1
//	12
//	15

}
