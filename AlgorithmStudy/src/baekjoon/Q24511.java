import java.util.*;

public class Q24511 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> queueStackTypeList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();
            queueStackTypeList.add(X);
        }

        for (Integer integer : queueStackTypeList) {
            int Y = scanner.nextInt();
            if (integer == 0) {
                deque.add(Y);
            }
        }

        int M = scanner.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int Z = scanner.nextInt();
            deque.addFirst(Z);
            sb.append(deque.pollLast()).append(" ");
        }

        System.out.print(sb);

    }
}
