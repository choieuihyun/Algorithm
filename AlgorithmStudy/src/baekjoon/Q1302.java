import com.sun.source.tree.Tree;

import java.util.*;

public class Q1302 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Map<String, Integer> bestSeller = new TreeMap<>();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String name = scanner.next();
            bestSeller.put(name, bestSeller.getOrDefault(name, 0) + 1);
        }

        int maxValue = Collections.max(bestSeller.values());

        for (String key : bestSeller.keySet()) {
            int result = bestSeller.get(key);
            if (result == maxValue) {
                System.out.println(key);
                break;
            }
        }

    }
}
