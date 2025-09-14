import java.util.Scanner;
import java.util.Stack;

public class Q1439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String N = scanner.next();

        int zero = 0;
        int one = 0;

        char current = N.charAt(0);

        if (current == '0')
            zero++;
        else
            one++;

        for (int i = 1; i < N.length(); i++) {
            if (N.charAt(i) != N.charAt(i-1)) {
                if (N.charAt(i) == '0')
                    zero++;
                else
                    one++;
            }
        }

        System.out.println(Math.min(zero, one));
    }
}
