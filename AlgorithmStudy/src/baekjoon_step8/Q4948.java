package baekjoon_step8;

import java.util.Scanner;

public class Q4948 {
	
	public static boolean[] prime = new boolean[246913];

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		get_prime();
		
		while(true) {
			int num = scanner.nextInt();
			
			if(num == 0) break;
			
			int count = 0;
			
			for(int i = num + 1; i <= num*2; i++) {
				if(!prime[i])
					count++;
			}
			
			System.out.println(count);
			
			
		}

	}
	
	public static void get_prime() {
		
		prime[0] = prime[1] = true;
		
		for(int i = 2; i < Math.sqrt(prime.length); i++) {
			if(prime[i]) 
				continue;
			
			for(int j = i*i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
		
	}
	


}
