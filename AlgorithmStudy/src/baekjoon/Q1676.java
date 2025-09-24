import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q1676 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int divider = 5;
        int count = 0;
        while (N / divider > 0) {
            count += N / divider;
            divider *= 5;

        }

        System.out.println(count);

    }
}
