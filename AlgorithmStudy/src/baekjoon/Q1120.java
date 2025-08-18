import java.util.Scanner;

public class Q1120 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        int min = Integer.MAX_VALUE;
        int count = 0;

        for (int i = 0; i <= (b.length() - a.length()); i++) {
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) != b.charAt(j + i)) {
                    count += 1;
                }
            }
            min = Math.min(min, count);
            count = 0;
        }

        System.out.println(min);
    }
}
