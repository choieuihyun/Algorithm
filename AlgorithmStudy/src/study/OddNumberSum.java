package study;

public class OddNumberSum {
	
	public static void main(String[] args) {
		
		System.out.print(oddNumberSum(100));
		
		
	}
	
	static int oddNumberSum(int a) {
		
		int sum = 0;
		int sum2 = 0;
		
		for(int i=0; i<=a; i++) {
			
			if(i % 2 != 0) {
				System.out.println(i);
				sum += i;
				
				if(i % 3 == 0) {
					sum = sum - i;
					sum2 += i;
				}
			}
			
		}
		
		System.out.println(sum2);
		return sum;
	}

}
