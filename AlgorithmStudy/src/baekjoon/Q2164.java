import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Q2164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Queue<Integer> cards = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            cards.offer(i);
        }

        while (true) {

            if (cards.size() == 1) {
                System.out.println(cards.peek());
                return;
            }

            cards.remove();

            int behind = cards.remove();
            cards.offer(behind);
        }

    }
}
