package project.dayOne;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class dayOne_11650 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] array = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                int x = scanner.nextInt();
                array[i][j] = x;
            }
        }

        Arrays.sort(array, (a,b) -> {
            if (a[0] == b[0])
                return a[1]-b[1];

            return a[0]-b[0];
        });

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
