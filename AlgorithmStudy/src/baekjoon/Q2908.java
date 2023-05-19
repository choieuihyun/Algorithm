package baekjoon;

import java.util.Scanner;


public class Q2908 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		a = ((a%10) * 100) + ((a%100) - (a%10)) + (a/100);
		b = ((b%10) * 100) + ((b%100) - (b%10)) + (b/100);
		
		System.out.print(a>b ? a : b);
		
	}

//		Scanner scanner = new Scanner(System.in);
//		
//		String a = scanner.next();
//		String b = scanner.next();
//		
//		int [] arrayA = new int[3];
//		int [] arrayB = new int[3];
//		
//		int sumA = 0;
//		int sumB = 0;
//				
//		for(int i = 0; i < arrayA.length; i++) {
//			arrayA[i] = a.charAt(i);
//		}
//		
//		reverse(arrayA);
//		
//		for(int i = 0; i < arrayB.length; i++) {
//			arrayB[i] = b.charAt(i);
//		}
//		
//		reverse(arrayB);
//		
//		sumA = (arrayA[0] * 100) + (arrayA[1] * 10) + arrayA[2];
//		sumB = (arrayB[0] * 100) + (arrayB[1] * 10) + arrayB[2];
//		
//
//		for(int i = 0 ; i < 3; i++) {
//			if(sumA > sumB) {
//				System.out.print((char)arrayA[i]);
//			} else 
//				System.out.print((char)arrayB[i]);
//		}
//			
//		
//	}
//	
//	static void reverse(int [] array) {
//
//		int temp = array[0];
//		array[0] = array[2]; 
//		array[2] = temp;
//
//	}

}
