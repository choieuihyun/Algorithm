import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Q2161 {
    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();
        Queue<Integer> answerQueue = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        while (queue.size() > 1) {
            int a = queue.poll();
            System.out.print(a + " ");

            int b = queue.poll();
            queue.add(b);
        }

        System.out.print(queue.poll());
    }
}
