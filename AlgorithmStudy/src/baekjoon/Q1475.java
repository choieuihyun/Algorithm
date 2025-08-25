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
    }
}
