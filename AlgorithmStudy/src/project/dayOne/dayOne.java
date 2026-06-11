package project.dayOne;

import java.util.Scanner;

public class dayOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (m == array[i]) {
                count++;
            }
        }

        System.out.print(count);
    }
}
