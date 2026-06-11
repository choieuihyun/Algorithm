package project.dayTwo;

import java.util.Scanner;

public class dayTwo_2798 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] array = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k < N; k++) {
                    int result = array[i] + array[j] + array[k];
                    // array[i] + array[j] + array[k] 값이 M보단 작으면서 최댓값.
                    if (result <= M) {
                        max = Math.max(max, array[i] + array[j] + array[k]);
                    }
                }
            }
        }

        System.out.println(max);
    }
}
