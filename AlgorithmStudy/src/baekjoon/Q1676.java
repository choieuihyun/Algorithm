import java.util.Scanner;

public class Q1676 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int count = 0;
        int divisor = 5;
        while(a / divisor > 0) {
            count += a / 5;
            divisor *= 5;
        }
        System.out.println(count);

    }


}
