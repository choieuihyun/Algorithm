package project.dayOne;

import java.util.Scanner;

public class dayOne_1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int sum = 0;
        int max = 0;
                
        for (int i = 0; i < x; i++) {
            int score = scanner.nextInt();
            sum += score;
            max = Math.max(max,score);
        }

        double avg = (double) sum / max * 100 / x;
        System.out.print(avg);
    }
}
