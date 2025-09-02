import java.util.Scanner;

public class Q1475 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        int[] count = new int [10];

        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - '0';
            count[num]++;
        }

        int sixOrNine = (count[6] + count[9] + 1) / 2;

        int max = 0;
        for (int i = 0; i <= 9; i++) {
            if (i == 6 || i == 9) {
                continue;
            }
            max = Math.max(max, count[i]);
        }

        max = Math.max(max, sixOrNine);

        System.out.println(max);
    }
}
