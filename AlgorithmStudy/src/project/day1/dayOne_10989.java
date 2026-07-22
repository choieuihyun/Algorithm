package project.dayOne;

import java.util.Arrays;
import java.util.Scanner;

public class dayOne_10989 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] array = new int[10001];
        for (int i = 0; i < N; i++) {
            int M = scanner.nextInt();
            array[M]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                for (int j = 0; j < array[i]; j++) {
                    sb.append(i + "\n");
                }
            }
        }

        System.out.print(sb);
    }
}
