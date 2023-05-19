package baekjoon;

import java.util.Scanner;

public class Q9020 {
	
	static boolean[] prime = new boolean[10001];

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		get_prime();
			
		int t = scanner.nextInt();
			
		for(int i = 0; i < t; i++) {
			
			int s = scanner.nextInt();
			
			int a = s/2;
			
			int b = s/2;
			
			
			while(true) {
				if(prime[a] == false && prime[b] == false) {
					System.out.print(a + " " + b + "\n");
					break;
				}
				a--;
				b++;
			}
		}
			
}
			
	public static void get_prime() {

		prime[0] = prime[1] = true;
		
		for(int i = 2; i < prime.length; i++) {
			if(prime[i])
				continue;
			
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
			
			
		}
		

		
	}

}
