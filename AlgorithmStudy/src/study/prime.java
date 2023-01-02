package study;
import java.util.Scanner;

public class prime {
	
	public static boolean[] prime;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int count = 0;
		make_prime(n);
		
		for(int i = 0; i < prime.length; i++) {
			if(prime[i] == false)
				count++;
			System.out.print(prime[i]);
		}
		
		System.out.print(count);

	}
	
	public static void make_prime(int N) {
		
		prime = new boolean[N+1];
		
		if(N < 2) {
			return;
		}
		
		prime[0] = prime[1] = true;
		
		for(int i = 2; i < Math.sqrt(N); i++) {
			
			if(prime[i] == true) {
				continue;
			}
			
			for(int j = i; j < prime.length; j = j+i) {
				prime[j] = true;
			}
			
		}
		
	} 

}
