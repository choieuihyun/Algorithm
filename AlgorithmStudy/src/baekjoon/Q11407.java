import java.util.*;

public class Q11407 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        List<Integer> coinList = new ArrayList<>();
        int amount = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            coinList.add(A);
        }

        coinList.sort((o1, o2) -> o2 - o1);

        for (int i = 0; i < N; i++) {
            int coin = coinList.get(i);
            if (coin <= K) {
                amount += K / coin;
                K = K % coin;
            }
        }

        System.out.print(amount);

    }
}
