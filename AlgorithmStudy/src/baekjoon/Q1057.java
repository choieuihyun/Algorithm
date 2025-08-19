import java.util.Scanner;

public class Q1057 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int round = scanner.nextInt();
        int kim = scanner.nextInt();
        int lim = scanner.nextInt();
        int count = 0;

        while (kim != lim) {
            if (kim % 2 == 1) {
                kim = (kim + 1) / 2;
            } else {
                kim = kim / 2;
            }

            if (lim % 2 == 1) {
                lim = (lim + 1) / 2;
            } else {
                lim = lim / 2;
            }

            count++;
        }

        System.out.print(count);
    }
}
