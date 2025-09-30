import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class Q1021 {
    public static void main(String[] args) {

        Deque<Integer> queue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        for (int i = 0; i < M; i++) {
            int X = scanner.nextInt();

            int index = 0;
            for (int num : queue) {
                if (num == X)
                    break;
                index++;
            }

            if (index <= queue.size() / 2) {
                while (queue.peekFirst() != X) {
                    queue.offerLast(queue.pollFirst());
                    count++;
                }
            } else {
                while (queue.peekFirst() != X) {
                    queue.offerFirst(queue.pollLast());
                    count++;
                }
            }

            queue.pollFirst();
        }

        System.out.println(count);

    }


}
