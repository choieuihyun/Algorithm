import java.util.*;

public class Q1920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        Set<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            hashSet.add(scanner.nextInt());
        }

        int M = scanner.nextInt();

        for (int i = 0; i < M; i++) {
            int X = scanner.nextInt();
            if (hashSet.contains(X)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
