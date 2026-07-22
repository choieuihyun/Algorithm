package project.dayTwo;

import java.util.Scanner;

public class dayTwo_10872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        System.out.println(factorial(N));
    }

    static int factorial(int i) {
        if (i == 0 || i == 1) {
            return 1;
        }
        return i * factorial(i-1);
    }
}
